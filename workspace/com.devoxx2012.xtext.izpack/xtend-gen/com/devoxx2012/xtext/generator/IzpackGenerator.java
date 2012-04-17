package com.devoxx2012.xtext.generator;

import com.devoxx2012.xtext.izpack.Author;
import com.devoxx2012.xtext.izpack.Constraint;
import com.devoxx2012.xtext.izpack.File;
import com.devoxx2012.xtext.izpack.ISO3Code;
import com.devoxx2012.xtext.izpack.Identification;
import com.devoxx2012.xtext.izpack.Installer;
import com.devoxx2012.xtext.izpack.Locale;
import com.devoxx2012.xtext.izpack.OS;
import com.devoxx2012.xtext.izpack.Pack;
import com.devoxx2012.xtext.izpack.Panel;
import com.devoxx2012.xtext.izpack.Uninstall;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;

@SuppressWarnings("all")
public class IzpackGenerator implements IGenerator {
  public String xmlName(final Resource res) {
      URI _uRI = res.getURI();
      String _lastSegment = _uRI.lastSegment();
      String name = _lastSegment;
      int _indexOf = name.indexOf(".");
      String _substring = name.substring(0, _indexOf);
      String _concat = _substring.concat(".xml");
      return _concat;
  }
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    String _xmlName = this.xmlName(resource);
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    CharSequence _gen = this.gen(((Installer) _head));
    fsa.generateFile(_xmlName, _gen);
  }
  
  public CharSequence gen(final Installer installer) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<installation version=\"1.0\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<info>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<appname>");
    Identification _identification = installer.getIdentification();
    String _name = _identification.getName();
    _builder.append(_name, "    ");
    _builder.append("</appname>");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<appversion>");
    Identification _identification_1 = installer.getIdentification();
    String _version = _identification_1.getVersion();
    _builder.append(_version, "    ");
    _builder.append("</appversion>");
    _builder.newLineIfNotEmpty();
    {
      Identification _identification_2 = installer.getIdentification();
      String _url = _identification_2.getUrl();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_url, null);
      if (_operator_notEquals) {
        _builder.append("    ");
        _builder.append("<url>");
        Identification _identification_3 = installer.getIdentification();
        String _url_1 = _identification_3.getUrl();
        _builder.append(_url_1, "    ");
        _builder.append("</url>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.append("<authors>");
    _builder.newLine();
    {
      EList<Author> _authors = installer.getAuthors();
      for(final Author author : _authors) {
        _builder.append("    ");
        _builder.append("<author name=\"");
        String _name_1 = author.getName();
        _builder.append(_name_1, "    ");
        _builder.append("\" email=\"");
        String _email = author.getEmail();
        _builder.append(_email, "    ");
        _builder.append("\"/>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.append("</authors>");
    _builder.newLine();
    {
      Uninstall _uninstall = installer.getUninstall();
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_uninstall, null);
      if (_operator_notEquals_1) {
        _builder.append("    ");
        _builder.append("<uninstaller name=\"");
        Uninstall _uninstall_1 = installer.getUninstall();
        String _name_2 = _uninstall_1.getName();
        _builder.append(_name_2, "    ");
        _builder.append("\" path=\"");
        Uninstall _uninstall_2 = installer.getUninstall();
        String _path = _uninstall_2.getPath();
        _builder.append(_path, "    ");
        _builder.append("\"/>");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Constraint _constraint = installer.getConstraint();
      String _javaversion = _constraint==null?(String)null:_constraint.getJavaversion();
      boolean _operator_notEquals_2 = ObjectExtensions.operator_notEquals(_javaversion, null);
      if (_operator_notEquals_2) {
        _builder.append("    ");
        _builder.append("<javaversion>");
        Constraint _constraint_1 = installer.getConstraint();
        String _javaversion_1 = _constraint_1.getJavaversion();
        _builder.append(_javaversion_1, "    ");
        _builder.append("</javaversion>");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Identification _identification_4 = installer.getIdentification();
      String _webdir = _identification_4.getWebdir();
      boolean _operator_notEquals_3 = ObjectExtensions.operator_notEquals(_webdir, null);
      if (_operator_notEquals_3) {
        _builder.append("    ");
        _builder.append("<webdir>");
        Identification _identification_5 = installer.getIdentification();
        String _webdir_1 = _identification_5.getWebdir();
        _builder.append(_webdir_1, "    ");
        _builder.append("</webdir>");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      String _summarylog = installer.getSummarylog();
      boolean _operator_notEquals_4 = ObjectExtensions.operator_notEquals(_summarylog, null);
      if (_operator_notEquals_4) {
        _builder.append("    ");
        _builder.append("<summarylogfile>");
        String _summarylog_1 = installer.getSummarylog();
        _builder.append(_summarylog_1, "    ");
        _builder.append("</summarylogfile>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.append("<writeinstallationinformation>");
    {
      boolean _isInstallation = installer.isInstallation();
      if (_isInstallation) {
        _builder.append("true");
      } else {
        _builder.append("false");
      }
    }
    _builder.append("</writeinstallationinformation>");
    _builder.newLineIfNotEmpty();
    {
      Constraint _constraint_2 = installer.getConstraint();
      boolean _isPacked = _constraint_2==null?false:_constraint_2.isPacked();
      if (_isPacked) {
        _builder.append("    ");
        _builder.append("<pack200/>");
        _builder.newLine();
      }
    }
    _builder.append("  ");
    _builder.append("</info>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<locale>");
    _builder.newLine();
    {
      Locale _locale = installer.getLocale();
      EList<ISO3Code> _isocodes = _locale.getIsocodes();
      for(final ISO3Code code : _isocodes) {
        _builder.append("  ");
        _builder.append("<langpack iso3=\"");
        String _name_3 = code.name();
        _builder.append(_name_3, "  ");
        _builder.append("\"/>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("  ");
    _builder.append("</locale>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<panels>");
    _builder.newLine();
    {
      EList<Panel> _panels = installer.getPanels();
      for(final Panel panel : _panels) {
        _builder.append("  ");
        _builder.append("<panel id=\"");
        String _name_4 = panel.getName();
        _builder.append(_name_4, "  ");
        _builder.append("\" classname=\"");
        JvmTypeReference _classname = panel.getClassname();
        String _identifier = _classname.getIdentifier();
        _builder.append(_identifier, "  ");
        _builder.append("\" jar=\"");
        String _jar = panel.getJar();
        _builder.append(_jar, "  ");
        _builder.append("\"/>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("  ");
    _builder.append("</panels>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<packs>");
    _builder.newLine();
    {
      EList<Pack> _packs = installer.getPacks();
      for(final Pack pack : _packs) {
        _builder.append("  ");
        _builder.append("<pack id=\"");
        String _name_5 = pack.getName();
        _builder.append(_name_5, "  ");
        _builder.append("\" name=\"");
        String _label = pack.getLabel();
        _builder.append(_label, "  ");
        _builder.append("\" ");
        {
          OS _os = pack.getOs();
          boolean _operator_notEquals_5 = ObjectExtensions.operator_notEquals(_os, OS.ALL);
          if (_operator_notEquals_5) {
            _builder.append("os=\"");
            OS _os_1 = pack.getOs();
            String _name_6 = _os_1.name();
            _builder.append(_name_6, "  ");
            _builder.append("\" ");
          }
        }
        _builder.append("required=\"");
        {
          boolean _isOptional = pack.isOptional();
          if (_isOptional) {
            _builder.append("no");
          } else {
            _builder.append("yes");
          }
        }
        _builder.append("\" loose=\"");
        boolean _isLoose = pack.isLoose();
        _builder.append(_isLoose, "  ");
        _builder.append("\" uninstall=\"");
        {
          boolean _isKeep = pack.isKeep();
          if (_isKeep) {
            _builder.append("no");
          } else {
            _builder.append("yes");
          }
        }
        _builder.append("\">");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("  ");
        _builder.append("<description/>");
        _builder.newLine();
        {
          EList<File> _files = pack.getFiles();
          for(final File file : _files) {
            {
              String _alias = file.getAlias();
              boolean _operator_notEquals_6 = ObjectExtensions.operator_notEquals(_alias, null);
              if (_operator_notEquals_6) {
                _builder.append("  ");
                _builder.append("  ");
                _builder.append("<singlefile src=\"");
                String _path_1 = file.getPath();
                _builder.append(_path_1, "    ");
                _builder.append("\" target=\"");
                String _destination = file.getDestination();
                _builder.append(_destination, "    ");
                _builder.append("/");
                String _alias_1 = file.getAlias();
                _builder.append(_alias_1, "    ");
                _builder.append("\"/>");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("  ");
                _builder.append("  ");
                _builder.append("<file src=\"");
                String _path_2 = file.getPath();
                _builder.append(_path_2, "    ");
                _builder.append("\" targetdir=\"");
                String _destination_1 = file.getDestination();
                _builder.append(_destination_1, "    ");
                _builder.append("\"/>");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.append("  ");
        _builder.append("</pack>");
        _builder.newLine();
      }
    }
    _builder.append("  ");
    _builder.append("</packs>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<guiprefs resizable=\"yes\" width=\"800\" height=\"600\"/>");
    _builder.newLine();
    _builder.append("</installation>");
    _builder.newLine();
    return _builder;
  }
}
