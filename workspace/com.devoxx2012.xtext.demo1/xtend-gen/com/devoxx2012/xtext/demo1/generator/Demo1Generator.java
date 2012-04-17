package com.devoxx2012.xtext.demo1.generator;

import com.devoxx2012.xtext.demo1.demo1.Category;
import com.devoxx2012.xtext.demo1.demo1.Model;
import com.devoxx2012.xtext.demo1.demo1.RatioExpression;
import com.devoxx2012.xtext.demo1.demo1.Rule;
import com.devoxx2012.xtext.demo1.demo1.RuleExpression;
import com.devoxx2012.xtext.demo1.demo1.TestExpression;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class Demo1Generator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    String _className = this.className(resource);
    String _operator_plus = StringExtensions.operator_plus(_className, ".java");
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    CharSequence _javaCode = this.toJavaCode(((Model) _head));
    fsa.generateFile(_operator_plus, _javaCode);
  }
  
  public String className(final Resource res) {
      URI _uRI = res.getURI();
      String _lastSegment = _uRI.lastSegment();
      String name = _lastSegment;
      int _indexOf = name.indexOf(".");
      String _substring = name.substring(0, _indexOf);
      return _substring;
  }
  
  public CharSequence toJavaCode(final Model m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    Resource _eResource = m.eResource();
    String _className = this.className(_eResource);
    _builder.append(_className, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public int ratio(String category) {");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("int ratio = 0;");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.newLine();
    _builder.append("\t  ");
    Rule _rule = m.getRule();
    CharSequence _java = this.toJava(_rule);
    _builder.append(_java, "	  ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t  ");
    _builder.append("return ratio;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("new ");
    Resource _eResource_1 = m.eResource();
    String _className_1 = this.className(_eResource_1);
    _builder.append(_className_1, "	  ");
    _builder.append("().ratio(args[0]);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _toJava(final Rule rule) {
    StringConcatenation _builder = new StringConcatenation();
    RuleExpression _first = rule.getFirst();
    TestExpression _test = _first.getTest();
    CharSequence _java = this.toJava(_test);
    _builder.append(_java, "");
    _builder.newLineIfNotEmpty();
    RuleExpression _first_1 = rule.getFirst();
    RatioExpression _ratio = _first_1.getRatio();
    CharSequence _java_1 = this.toJava(_ratio);
    _builder.append(_java_1, "");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    {
      EObject _next = rule.getNext();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_next, null);
      if (_operator_notEquals) {
        _builder.append("else ");
        EObject _next_1 = rule.getNext();
        CharSequence _java_2 = this.toJava(_next_1);
        _builder.append(_java_2, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence toJava(final TestExpression expr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if (category.equals(\"");
    Category _category = expr.getCategory();
    String _name = _category.getName();
    _builder.append(_name, "");
    _builder.append("\")) {");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _toJava(final RatioExpression r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ratio = ");
    int _ratio = r.getRatio();
    _builder.append(_ratio, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence toJava(final EObject r) {
    if (r instanceof RatioExpression) {
      return _toJava((RatioExpression)r);
    } else if (r instanceof Rule) {
      return _toJava((Rule)r);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(r).toString());
    }
  }
}
