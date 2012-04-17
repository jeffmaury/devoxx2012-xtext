/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.izpack.impl;

import com.devoxx2012.xtext.izpack.Author;
import com.devoxx2012.xtext.izpack.Constraint;
import com.devoxx2012.xtext.izpack.Identification;
import com.devoxx2012.xtext.izpack.Installer;
import com.devoxx2012.xtext.izpack.IzpackPackage;
import com.devoxx2012.xtext.izpack.Locale;
import com.devoxx2012.xtext.izpack.Pack;
import com.devoxx2012.xtext.izpack.Packaging;
import com.devoxx2012.xtext.izpack.Panel;
import com.devoxx2012.xtext.izpack.Uninstall;
import com.devoxx2012.xtext.izpack.Variable;

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
 * An implementation of the model object '<em><b>Installer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.InstallerImpl#getIdentification <em>Identification</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.InstallerImpl#getAuthors <em>Authors</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.InstallerImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.InstallerImpl#getUninstall <em>Uninstall</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.InstallerImpl#getSummarylog <em>Summarylog</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.InstallerImpl#isInstallation <em>Installation</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.InstallerImpl#getPackaging <em>Packaging</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.InstallerImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.InstallerImpl#getPacks <em>Packs</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.InstallerImpl#getLocale <em>Locale</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.InstallerImpl#getPanels <em>Panels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstallerImpl extends MinimalEObjectImpl.Container implements Installer
{
  /**
   * The cached value of the '{@link #getIdentification() <em>Identification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentification()
   * @generated
   * @ordered
   */
  protected Identification identification;

  /**
   * The cached value of the '{@link #getAuthors() <em>Authors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthors()
   * @generated
   * @ordered
   */
  protected EList<Author> authors;

  /**
   * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraint()
   * @generated
   * @ordered
   */
  protected Constraint constraint;

  /**
   * The cached value of the '{@link #getUninstall() <em>Uninstall</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUninstall()
   * @generated
   * @ordered
   */
  protected Uninstall uninstall;

  /**
   * The default value of the '{@link #getSummarylog() <em>Summarylog</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSummarylog()
   * @generated
   * @ordered
   */
  protected static final String SUMMARYLOG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSummarylog() <em>Summarylog</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSummarylog()
   * @generated
   * @ordered
   */
  protected String summarylog = SUMMARYLOG_EDEFAULT;

  /**
   * The default value of the '{@link #isInstallation() <em>Installation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInstallation()
   * @generated
   * @ordered
   */
  protected static final boolean INSTALLATION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInstallation() <em>Installation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInstallation()
   * @generated
   * @ordered
   */
  protected boolean installation = INSTALLATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getPackaging() <em>Packaging</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackaging()
   * @generated
   * @ordered
   */
  protected Packaging packaging;

  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<Variable> variables;

  /**
   * The cached value of the '{@link #getPacks() <em>Packs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPacks()
   * @generated
   * @ordered
   */
  protected EList<Pack> packs;

  /**
   * The cached value of the '{@link #getLocale() <em>Locale</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocale()
   * @generated
   * @ordered
   */
  protected Locale locale;

  /**
   * The cached value of the '{@link #getPanels() <em>Panels</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPanels()
   * @generated
   * @ordered
   */
  protected EList<Panel> panels;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstallerImpl()
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
    return IzpackPackage.Literals.INSTALLER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Identification getIdentification()
  {
    return identification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdentification(Identification newIdentification, NotificationChain msgs)
  {
    Identification oldIdentification = identification;
    identification = newIdentification;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IzpackPackage.INSTALLER__IDENTIFICATION, oldIdentification, newIdentification);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentification(Identification newIdentification)
  {
    if (newIdentification != identification)
    {
      NotificationChain msgs = null;
      if (identification != null)
        msgs = ((InternalEObject)identification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IzpackPackage.INSTALLER__IDENTIFICATION, null, msgs);
      if (newIdentification != null)
        msgs = ((InternalEObject)newIdentification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IzpackPackage.INSTALLER__IDENTIFICATION, null, msgs);
      msgs = basicSetIdentification(newIdentification, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.INSTALLER__IDENTIFICATION, newIdentification, newIdentification));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Author> getAuthors()
  {
    if (authors == null)
    {
      authors = new EObjectContainmentEList<Author>(Author.class, this, IzpackPackage.INSTALLER__AUTHORS);
    }
    return authors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint getConstraint()
  {
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstraint(Constraint newConstraint, NotificationChain msgs)
  {
    Constraint oldConstraint = constraint;
    constraint = newConstraint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IzpackPackage.INSTALLER__CONSTRAINT, oldConstraint, newConstraint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraint(Constraint newConstraint)
  {
    if (newConstraint != constraint)
    {
      NotificationChain msgs = null;
      if (constraint != null)
        msgs = ((InternalEObject)constraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IzpackPackage.INSTALLER__CONSTRAINT, null, msgs);
      if (newConstraint != null)
        msgs = ((InternalEObject)newConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IzpackPackage.INSTALLER__CONSTRAINT, null, msgs);
      msgs = basicSetConstraint(newConstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.INSTALLER__CONSTRAINT, newConstraint, newConstraint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Uninstall getUninstall()
  {
    return uninstall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUninstall(Uninstall newUninstall, NotificationChain msgs)
  {
    Uninstall oldUninstall = uninstall;
    uninstall = newUninstall;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IzpackPackage.INSTALLER__UNINSTALL, oldUninstall, newUninstall);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUninstall(Uninstall newUninstall)
  {
    if (newUninstall != uninstall)
    {
      NotificationChain msgs = null;
      if (uninstall != null)
        msgs = ((InternalEObject)uninstall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IzpackPackage.INSTALLER__UNINSTALL, null, msgs);
      if (newUninstall != null)
        msgs = ((InternalEObject)newUninstall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IzpackPackage.INSTALLER__UNINSTALL, null, msgs);
      msgs = basicSetUninstall(newUninstall, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.INSTALLER__UNINSTALL, newUninstall, newUninstall));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSummarylog()
  {
    return summarylog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSummarylog(String newSummarylog)
  {
    String oldSummarylog = summarylog;
    summarylog = newSummarylog;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.INSTALLER__SUMMARYLOG, oldSummarylog, summarylog));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInstallation()
  {
    return installation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstallation(boolean newInstallation)
  {
    boolean oldInstallation = installation;
    installation = newInstallation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.INSTALLER__INSTALLATION, oldInstallation, installation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Packaging getPackaging()
  {
    return packaging;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPackaging(Packaging newPackaging, NotificationChain msgs)
  {
    Packaging oldPackaging = packaging;
    packaging = newPackaging;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IzpackPackage.INSTALLER__PACKAGING, oldPackaging, newPackaging);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackaging(Packaging newPackaging)
  {
    if (newPackaging != packaging)
    {
      NotificationChain msgs = null;
      if (packaging != null)
        msgs = ((InternalEObject)packaging).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IzpackPackage.INSTALLER__PACKAGING, null, msgs);
      if (newPackaging != null)
        msgs = ((InternalEObject)newPackaging).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IzpackPackage.INSTALLER__PACKAGING, null, msgs);
      msgs = basicSetPackaging(newPackaging, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.INSTALLER__PACKAGING, newPackaging, newPackaging));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectContainmentEList<Variable>(Variable.class, this, IzpackPackage.INSTALLER__VARIABLES);
    }
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Pack> getPacks()
  {
    if (packs == null)
    {
      packs = new EObjectContainmentEList<Pack>(Pack.class, this, IzpackPackage.INSTALLER__PACKS);
    }
    return packs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Locale getLocale()
  {
    return locale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLocale(Locale newLocale, NotificationChain msgs)
  {
    Locale oldLocale = locale;
    locale = newLocale;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IzpackPackage.INSTALLER__LOCALE, oldLocale, newLocale);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocale(Locale newLocale)
  {
    if (newLocale != locale)
    {
      NotificationChain msgs = null;
      if (locale != null)
        msgs = ((InternalEObject)locale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IzpackPackage.INSTALLER__LOCALE, null, msgs);
      if (newLocale != null)
        msgs = ((InternalEObject)newLocale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IzpackPackage.INSTALLER__LOCALE, null, msgs);
      msgs = basicSetLocale(newLocale, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.INSTALLER__LOCALE, newLocale, newLocale));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Panel> getPanels()
  {
    if (panels == null)
    {
      panels = new EObjectContainmentEList<Panel>(Panel.class, this, IzpackPackage.INSTALLER__PANELS);
    }
    return panels;
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
      case IzpackPackage.INSTALLER__IDENTIFICATION:
        return basicSetIdentification(null, msgs);
      case IzpackPackage.INSTALLER__AUTHORS:
        return ((InternalEList<?>)getAuthors()).basicRemove(otherEnd, msgs);
      case IzpackPackage.INSTALLER__CONSTRAINT:
        return basicSetConstraint(null, msgs);
      case IzpackPackage.INSTALLER__UNINSTALL:
        return basicSetUninstall(null, msgs);
      case IzpackPackage.INSTALLER__PACKAGING:
        return basicSetPackaging(null, msgs);
      case IzpackPackage.INSTALLER__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
      case IzpackPackage.INSTALLER__PACKS:
        return ((InternalEList<?>)getPacks()).basicRemove(otherEnd, msgs);
      case IzpackPackage.INSTALLER__LOCALE:
        return basicSetLocale(null, msgs);
      case IzpackPackage.INSTALLER__PANELS:
        return ((InternalEList<?>)getPanels()).basicRemove(otherEnd, msgs);
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
      case IzpackPackage.INSTALLER__IDENTIFICATION:
        return getIdentification();
      case IzpackPackage.INSTALLER__AUTHORS:
        return getAuthors();
      case IzpackPackage.INSTALLER__CONSTRAINT:
        return getConstraint();
      case IzpackPackage.INSTALLER__UNINSTALL:
        return getUninstall();
      case IzpackPackage.INSTALLER__SUMMARYLOG:
        return getSummarylog();
      case IzpackPackage.INSTALLER__INSTALLATION:
        return isInstallation();
      case IzpackPackage.INSTALLER__PACKAGING:
        return getPackaging();
      case IzpackPackage.INSTALLER__VARIABLES:
        return getVariables();
      case IzpackPackage.INSTALLER__PACKS:
        return getPacks();
      case IzpackPackage.INSTALLER__LOCALE:
        return getLocale();
      case IzpackPackage.INSTALLER__PANELS:
        return getPanels();
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
      case IzpackPackage.INSTALLER__IDENTIFICATION:
        setIdentification((Identification)newValue);
        return;
      case IzpackPackage.INSTALLER__AUTHORS:
        getAuthors().clear();
        getAuthors().addAll((Collection<? extends Author>)newValue);
        return;
      case IzpackPackage.INSTALLER__CONSTRAINT:
        setConstraint((Constraint)newValue);
        return;
      case IzpackPackage.INSTALLER__UNINSTALL:
        setUninstall((Uninstall)newValue);
        return;
      case IzpackPackage.INSTALLER__SUMMARYLOG:
        setSummarylog((String)newValue);
        return;
      case IzpackPackage.INSTALLER__INSTALLATION:
        setInstallation((Boolean)newValue);
        return;
      case IzpackPackage.INSTALLER__PACKAGING:
        setPackaging((Packaging)newValue);
        return;
      case IzpackPackage.INSTALLER__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends Variable>)newValue);
        return;
      case IzpackPackage.INSTALLER__PACKS:
        getPacks().clear();
        getPacks().addAll((Collection<? extends Pack>)newValue);
        return;
      case IzpackPackage.INSTALLER__LOCALE:
        setLocale((Locale)newValue);
        return;
      case IzpackPackage.INSTALLER__PANELS:
        getPanels().clear();
        getPanels().addAll((Collection<? extends Panel>)newValue);
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
      case IzpackPackage.INSTALLER__IDENTIFICATION:
        setIdentification((Identification)null);
        return;
      case IzpackPackage.INSTALLER__AUTHORS:
        getAuthors().clear();
        return;
      case IzpackPackage.INSTALLER__CONSTRAINT:
        setConstraint((Constraint)null);
        return;
      case IzpackPackage.INSTALLER__UNINSTALL:
        setUninstall((Uninstall)null);
        return;
      case IzpackPackage.INSTALLER__SUMMARYLOG:
        setSummarylog(SUMMARYLOG_EDEFAULT);
        return;
      case IzpackPackage.INSTALLER__INSTALLATION:
        setInstallation(INSTALLATION_EDEFAULT);
        return;
      case IzpackPackage.INSTALLER__PACKAGING:
        setPackaging((Packaging)null);
        return;
      case IzpackPackage.INSTALLER__VARIABLES:
        getVariables().clear();
        return;
      case IzpackPackage.INSTALLER__PACKS:
        getPacks().clear();
        return;
      case IzpackPackage.INSTALLER__LOCALE:
        setLocale((Locale)null);
        return;
      case IzpackPackage.INSTALLER__PANELS:
        getPanels().clear();
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
      case IzpackPackage.INSTALLER__IDENTIFICATION:
        return identification != null;
      case IzpackPackage.INSTALLER__AUTHORS:
        return authors != null && !authors.isEmpty();
      case IzpackPackage.INSTALLER__CONSTRAINT:
        return constraint != null;
      case IzpackPackage.INSTALLER__UNINSTALL:
        return uninstall != null;
      case IzpackPackage.INSTALLER__SUMMARYLOG:
        return SUMMARYLOG_EDEFAULT == null ? summarylog != null : !SUMMARYLOG_EDEFAULT.equals(summarylog);
      case IzpackPackage.INSTALLER__INSTALLATION:
        return installation != INSTALLATION_EDEFAULT;
      case IzpackPackage.INSTALLER__PACKAGING:
        return packaging != null;
      case IzpackPackage.INSTALLER__VARIABLES:
        return variables != null && !variables.isEmpty();
      case IzpackPackage.INSTALLER__PACKS:
        return packs != null && !packs.isEmpty();
      case IzpackPackage.INSTALLER__LOCALE:
        return locale != null;
      case IzpackPackage.INSTALLER__PANELS:
        return panels != null && !panels.isEmpty();
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
    result.append(" (summarylog: ");
    result.append(summarylog);
    result.append(", installation: ");
    result.append(installation);
    result.append(')');
    return result.toString();
  }

} //InstallerImpl
