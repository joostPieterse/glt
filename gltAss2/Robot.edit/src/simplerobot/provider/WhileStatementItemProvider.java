/**
 */
package simplerobot.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.emf.edit.provider.ViewerNotification;
import simplerobot.SimplerobotFactory;
import simplerobot.SimplerobotPackage;
import simplerobot.WhileStatement;

/**
 * This is the item provider adapter for a {@link simplerobot.WhileStatement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WhileStatementItemProvider extends StatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileStatementItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(SimplerobotPackage.Literals.WHILE_STATEMENT__COND);
			childrenFeatures.add(SimplerobotPackage.Literals.WHILE_STATEMENT__BODY);
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
	 * This returns WhileStatement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WhileStatement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_WhileStatement_type");
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

		switch (notification.getFeatureID(WhileStatement.class)) {
			case SimplerobotPackage.WHILE_STATEMENT__COND:
			case SimplerobotPackage.WHILE_STATEMENT__BODY:
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
				(SimplerobotPackage.Literals.WHILE_STATEMENT__COND,
				 SimplerobotFactory.eINSTANCE.createFull()));

		newChildDescriptors.add
			(createChildParameter
				(SimplerobotPackage.Literals.WHILE_STATEMENT__COND,
				 SimplerobotFactory.eINSTANCE.createMark()));

		newChildDescriptors.add
			(createChildParameter
				(SimplerobotPackage.Literals.WHILE_STATEMENT__COND,
				 SimplerobotFactory.eINSTANCE.createAhead()));

		newChildDescriptors.add
			(createChildParameter
				(SimplerobotPackage.Literals.WHILE_STATEMENT__COND,
				 SimplerobotFactory.eINSTANCE.createHeading()));

		newChildDescriptors.add
			(createChildParameter
				(SimplerobotPackage.Literals.WHILE_STATEMENT__COND,
				 SimplerobotFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(SimplerobotPackage.Literals.WHILE_STATEMENT__COND,
				 SimplerobotFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(SimplerobotPackage.Literals.WHILE_STATEMENT__BODY,
				 SimplerobotFactory.eINSTANCE.createComment()));

		newChildDescriptors.add
			(createChildParameter
				(SimplerobotPackage.Literals.WHILE_STATEMENT__BODY,
				 SimplerobotFactory.eINSTANCE.createSingleton()));

		newChildDescriptors.add
			(createChildParameter
				(SimplerobotPackage.Literals.WHILE_STATEMENT__BODY,
				 SimplerobotFactory.eINSTANCE.createTrace()));

		newChildDescriptors.add
			(createChildParameter
				(SimplerobotPackage.Literals.WHILE_STATEMENT__BODY,
				 SimplerobotFactory.eINSTANCE.createBuildWall()));

		newChildDescriptors.add
			(createChildParameter
				(SimplerobotPackage.Literals.WHILE_STATEMENT__BODY,
				 SimplerobotFactory.eINSTANCE.createDropMark()));

		newChildDescriptors.add
			(createChildParameter
				(SimplerobotPackage.Literals.WHILE_STATEMENT__BODY,
				 SimplerobotFactory.eINSTANCE.createWhileStatement()));

		newChildDescriptors.add
			(createChildParameter
				(SimplerobotPackage.Literals.WHILE_STATEMENT__BODY,
				 SimplerobotFactory.eINSTANCE.createRepeatStatement()));

		newChildDescriptors.add
			(createChildParameter
				(SimplerobotPackage.Literals.WHILE_STATEMENT__BODY,
				 SimplerobotFactory.eINSTANCE.createIfElseStatement()));

		newChildDescriptors.add
			(createChildParameter
				(SimplerobotPackage.Literals.WHILE_STATEMENT__BODY,
				 SimplerobotFactory.eINSTANCE.createIfStatement()));
	}

}
