/**
 */
package simplerobot.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import simplerobot.RepeatStatement;
import simplerobot.SimplerobotFactory;
import simplerobot.SimplerobotPackage;

/**
 * This is the item provider adapter for a {@link simplerobot.RepeatStatement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RepeatStatementItemProvider extends StatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatStatementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTimesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Times feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RepeatStatement_times_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RepeatStatement_times_feature", "_UI_RepeatStatement_type"),
				 SimplerobotPackage.Literals.REPEAT_STATEMENT__TIMES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SimplerobotPackage.Literals.REPEAT_STATEMENT__BODY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns RepeatStatement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RepeatStatement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		RepeatStatement repeatStatement = (RepeatStatement)object;
		return getString("_UI_RepeatStatement_type") + " " + repeatStatement.getTimes();
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(RepeatStatement.class)) {
			case SimplerobotPackage.REPEAT_STATEMENT__TIMES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SimplerobotPackage.REPEAT_STATEMENT__BODY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SimplerobotPackage.Literals.REPEAT_STATEMENT__BODY,
				 SimplerobotFactory.eINSTANCE.createComment()));

		newChildDescriptors.add
			(createChildParameter
				(SimplerobotPackage.Literals.REPEAT_STATEMENT__BODY,
				 SimplerobotFactory.eINSTANCE.createSingleton()));

		newChildDescriptors.add
			(createChildParameter
				(SimplerobotPackage.Literals.REPEAT_STATEMENT__BODY,
				 SimplerobotFactory.eINSTANCE.createTrace()));

		newChildDescriptors.add
			(createChildParameter
				(SimplerobotPackage.Literals.REPEAT_STATEMENT__BODY,
				 SimplerobotFactory.eINSTANCE.createBuildWall()));

		newChildDescriptors.add
			(createChildParameter
				(SimplerobotPackage.Literals.REPEAT_STATEMENT__BODY,
				 SimplerobotFactory.eINSTANCE.createDropMark()));

		newChildDescriptors.add
			(createChildParameter
				(SimplerobotPackage.Literals.REPEAT_STATEMENT__BODY,
				 SimplerobotFactory.eINSTANCE.createWhileStatement()));

		newChildDescriptors.add
			(createChildParameter
				(SimplerobotPackage.Literals.REPEAT_STATEMENT__BODY,
				 SimplerobotFactory.eINSTANCE.createRepeatStatement()));

		newChildDescriptors.add
			(createChildParameter
				(SimplerobotPackage.Literals.REPEAT_STATEMENT__BODY,
				 SimplerobotFactory.eINSTANCE.createIfElseStatement()));

		newChildDescriptors.add
			(createChildParameter
				(SimplerobotPackage.Literals.REPEAT_STATEMENT__BODY,
				 SimplerobotFactory.eINSTANCE.createIfStatement()));
	}

}
