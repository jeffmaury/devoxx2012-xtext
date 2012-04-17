/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.izpack.impl;

import com.devoxx2012.xtext.izpack.File;
import com.devoxx2012.xtext.izpack.IzpackPackage;
import com.devoxx2012.xtext.izpack.OS;
import com.devoxx2012.xtext.izpack.Pack;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.PackImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.PackImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.PackImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.PackImpl#isLoose <em>Loose</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.PackImpl#isKeep <em>Keep</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.PackImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.PackImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.PackImpl#getOs <em>Os</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackImpl extends MinimalEObjectImpl.Container implements Pack
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

  /**
   * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOptional()
   * @generated
   * @ordered
   */
  protected static final boolean OPTIONAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOptional()
   * @generated
   * @ordered
   */
  protected boolean optional = OPTIONAL_EDEFAULT;

  /**
   * The default value of the '{@link #isLoose() <em>Loose</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLoose()
   * @generated
   * @ordered
   */
  protected static final boolean LOOSE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLoose() <em>Loose</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLoose()
   * @generated
   * @ordered
   */
  protected boolean loose = LOOSE_EDEFAULT;

  /**
   * The default value of the '{@link #isKeep() <em>Keep</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isKeep()
   * @generated
   * @ordered
   */
  protected static final boolean KEEP_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isKeep() <em>Keep</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isKeep()
   * @generated
   * @ordered
   */
  protected boolean keep = KEEP_EDEFAULT;

  /**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected Pack parent;

  /**
   * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFiles()
   * @generated
   * @ordered
   */
  protected EList<File> files;

  /**
   * The default value of the '{@link #getOs() <em>Os</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOs()
   * @generated
   * @ordered
   */
  protected static final OS OS_EDEFAULT = OS.ALL;

  /**
   * The cached value of the '{@link #getOs() <em>Os</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOs()
   * @generated
   * @ordered
   */
  protected OS os = OS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return IzpackPackage.Literals.PACK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.PACK__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.PACK__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOptional()
  {
    return optional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptional(boolean newOptional)
  {
    boolean oldOptional = optional;
    optional = newOptional;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.PACK__OPTIONAL, oldOptional, optional));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLoose()
  {
    return loose;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLoose(boolean newLoose)
  {
    boolean oldLoose = loose;
    loose = newLoose;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.PACK__LOOSE, oldLoose, loose));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isKeep()
  {
    return keep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKeep(boolean newKeep)
  {
    boolean oldKeep = keep;
    keep = newKeep;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.PACK__KEEP, oldKeep, keep));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pack getParent()
  {
    if (parent != null && parent.eIsProxy())
    {
      InternalEObject oldParent = (InternalEObject)parent;
      parent = (Pack)eResolveProxy(oldParent);
      if (parent != oldParent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IzpackPackage.PACK__PARENT, oldParent, parent));
      }
    }
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pack basicGetParent()
  {
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(Pack newParent)
  {
    Pack oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.PACK__PARENT, oldParent, parent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<File> getFiles()
  {
    if (files == null)
    {
      files = new EObjectContainmentEList<File>(File.class, this, IzpackPackage.PACK__FILES);
    }
    return files;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OS getOs()
  {
    return os;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOs(OS newOs)
  {
    OS oldOs = os;
    os = newOs == null ? OS_EDEFAULT : newOs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.PACK__OS, oldOs, os));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case IzpackPackage.PACK__FILES:
        return ((InternalEList<?>)getFiles()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case IzpackPackage.PACK__NAME:
        return getName();
      case IzpackPackage.PACK__LABEL:
        return getLabel();
      case IzpackPackage.PACK__OPTIONAL:
        return isOptional();
      case IzpackPackage.PACK__LOOSE:
        return isLoose();
      case IzpackPackage.PACK__KEEP:
        return isKeep();
      case IzpackPackage.PACK__PARENT:
        if (resolve) return getParent();
        return basicGetParent();
      case IzpackPackage.PACK__FILES:
        return getFiles();
      case IzpackPackage.PACK__OS:
        return getOs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IzpackPackage.PACK__NAME:
        setName((String)newValue);
        return;
      case IzpackPackage.PACK__LABEL:
        setLabel((String)newValue);
        return;
      case IzpackPackage.PACK__OPTIONAL:
        setOptional((Boolean)newValue);
        return;
      case IzpackPackage.PACK__LOOSE:
        setLoose((Boolean)newValue);
        return;
      case IzpackPackage.PACK__KEEP:
        setKeep((Boolean)newValue);
        return;
      case IzpackPackage.PACK__PARENT:
        setParent((Pack)newValue);
        return;
      case IzpackPackage.PACK__FILES:
        getFiles().clear();
        getFiles().addAll((Collection<? extends File>)newValue);
        return;
      case IzpackPackage.PACK__OS:
        setOs((OS)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case IzpackPackage.PACK__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IzpackPackage.PACK__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case IzpackPackage.PACK__OPTIONAL:
        setOptional(OPTIONAL_EDEFAULT);
        return;
      case IzpackPackage.PACK__LOOSE:
        setLoose(LOOSE_EDEFAULT);
        return;
      case IzpackPackage.PACK__KEEP:
        setKeep(KEEP_EDEFAULT);
        return;
      case IzpackPackage.PACK__PARENT:
        setParent((Pack)null);
        return;
      case IzpackPackage.PACK__FILES:
        getFiles().clear();
        return;
      case IzpackPackage.PACK__OS:
        setOs(OS_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case IzpackPackage.PACK__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IzpackPackage.PACK__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case IzpackPackage.PACK__OPTIONAL:
        return optional != OPTIONAL_EDEFAULT;
      case IzpackPackage.PACK__LOOSE:
        return loose != LOOSE_EDEFAULT;
      case IzpackPackage.PACK__KEEP:
        return keep != KEEP_EDEFAULT;
      case IzpackPackage.PACK__PARENT:
        return parent != null;
      case IzpackPackage.PACK__FILES:
        return files != null && !files.isEmpty();
      case IzpackPackage.PACK__OS:
        return os != OS_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", label: ");
    result.append(label);
    result.append(", optional: ");
    result.append(optional);
    result.append(", loose: ");
    result.append(loose);
    result.append(", keep: ");
    result.append(keep);
    result.append(", os: ");
    result.append(os);
    result.append(')');
    return result.toString();
  }

} //PackImpl
