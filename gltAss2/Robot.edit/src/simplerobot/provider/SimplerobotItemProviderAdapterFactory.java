/**
 */
package simplerobot.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import simplerobot.util.SimplerobotAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplerobotItemProviderAdapterFactory extends SimplerobotAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplerobotItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link simplerobot.Robot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotItemProvider robotItemProvider;

	/**
	 * This creates an adapter for a {@link simplerobot.Robot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRobotAdapter() {
		if (robotItemProvider == null) {
			robotItemProvider = new RobotItemProvider(this);
		}

		return robotItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simplerobot.Comment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentItemProvider commentItemProvider;

	/**
	 * This creates an adapter for a {@link simplerobot.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommentAdapter() {
		if (commentItemProvider == null) {
			commentItemProvider = new CommentItemProvider(this);
		}

		return commentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simplerobot.Singleton} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingletonItemProvider singletonItemProvider;

	/**
	 * This creates an adapter for a {@link simplerobot.Singleton}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSingletonAdapter() {
		if (singletonItemProvider == null) {
			singletonItemProvider = new SingletonItemProvider(this);
		}

		return singletonItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simplerobot.Trace} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceItemProvider traceItemProvider;

	/**
	 * This creates an adapter for a {@link simplerobot.Trace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTraceAdapter() {
		if (traceItemProvider == null) {
			traceItemProvider = new TraceItemProvider(this);
		}

		return traceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simplerobot.BuildWall} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildWallItemProvider buildWallItemProvider;

	/**
	 * This creates an adapter for a {@link simplerobot.BuildWall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBuildWallAdapter() {
		if (buildWallItemProvider == null) {
			buildWallItemProvider = new BuildWallItemProvider(this);
		}

		return buildWallItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simplerobot.DropMark} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropMarkItemProvider dropMarkItemProvider;

	/**
	 * This creates an adapter for a {@link simplerobot.DropMark}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDropMarkAdapter() {
		if (dropMarkItemProvider == null) {
			dropMarkItemProvider = new DropMarkItemProvider(this);
		}

		return dropMarkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simplerobot.WhileStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileStatementItemProvider whileStatementItemProvider;

	/**
	 * This creates an adapter for a {@link simplerobot.WhileStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWhileStatementAdapter() {
		if (whileStatementItemProvider == null) {
			whileStatementItemProvider = new WhileStatementItemProvider(this);
		}

		return whileStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simplerobot.RepeatStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepeatStatementItemProvider repeatStatementItemProvider;

	/**
	 * This creates an adapter for a {@link simplerobot.RepeatStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepeatStatementAdapter() {
		if (repeatStatementItemProvider == null) {
			repeatStatementItemProvider = new RepeatStatementItemProvider(this);
		}

		return repeatStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simplerobot.IfElseStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfElseStatementItemProvider ifElseStatementItemProvider;

	/**
	 * This creates an adapter for a {@link simplerobot.IfElseStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIfElseStatementAdapter() {
		if (ifElseStatementItemProvider == null) {
			ifElseStatementItemProvider = new IfElseStatementItemProvider(this);
		}

		return ifElseStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simplerobot.IfStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStatementItemProvider ifStatementItemProvider;

	/**
	 * This creates an adapter for a {@link simplerobot.IfStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIfStatementAdapter() {
		if (ifStatementItemProvider == null) {
			ifStatementItemProvider = new IfStatementItemProvider(this);
		}

		return ifStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simplerobot.Expression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionItemProvider expressionItemProvider;

	/**
	 * This creates an adapter for a {@link simplerobot.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExpressionAdapter() {
		if (expressionItemProvider == null) {
			expressionItemProvider = new ExpressionItemProvider(this);
		}

		return expressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simplerobot.Full} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FullItemProvider fullItemProvider;

	/**
	 * This creates an adapter for a {@link simplerobot.Full}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFullAdapter() {
		if (fullItemProvider == null) {
			fullItemProvider = new FullItemProvider(this);
		}

		return fullItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simplerobot.Mark} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkItemProvider markItemProvider;

	/**
	 * This creates an adapter for a {@link simplerobot.Mark}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMarkAdapter() {
		if (markItemProvider == null) {
			markItemProvider = new MarkItemProvider(this);
		}

		return markItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simplerobot.Ahead} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AheadItemProvider aheadItemProvider;

	/**
	 * This creates an adapter for a {@link simplerobot.Ahead}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAheadAdapter() {
		if (aheadItemProvider == null) {
			aheadItemProvider = new AheadItemProvider(this);
		}

		return aheadItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simplerobot.Heading} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeadingItemProvider headingItemProvider;

	/**
	 * This creates an adapter for a {@link simplerobot.Heading}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHeadingAdapter() {
		if (headingItemProvider == null) {
			headingItemProvider = new HeadingItemProvider(this);
		}

		return headingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simplerobot.Not} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotItemProvider notItemProvider;

	/**
	 * This creates an adapter for a {@link simplerobot.Not}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotAdapter() {
		if (notItemProvider == null) {
			notItemProvider = new NotItemProvider(this);
		}

		return notItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link simplerobot.String} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringItemProvider stringItemProvider;

	/**
	 * This creates an adapter for a {@link simplerobot.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringAdapter() {
		if (stringItemProvider == null) {
			stringItemProvider = new StringItemProvider(this);
		}

		return stringItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (robotItemProvider != null) robotItemProvider.dispose();
		if (commentItemProvider != null) commentItemProvider.dispose();
		if (singletonItemProvider != null) singletonItemProvider.dispose();
		if (traceItemProvider != null) traceItemProvider.dispose();
		if (buildWallItemProvider != null) buildWallItemProvider.dispose();
		if (dropMarkItemProvider != null) dropMarkItemProvider.dispose();
		if (whileStatementItemProvider != null) whileStatementItemProvider.dispose();
		if (repeatStatementItemProvider != null) repeatStatementItemProvider.dispose();
		if (ifElseStatementItemProvider != null) ifElseStatementItemProvider.dispose();
		if (ifStatementItemProvider != null) ifStatementItemProvider.dispose();
		if (expressionItemProvider != null) expressionItemProvider.dispose();
		if (fullItemProvider != null) fullItemProvider.dispose();
		if (markItemProvider != null) markItemProvider.dispose();
		if (aheadItemProvider != null) aheadItemProvider.dispose();
		if (headingItemProvider != null) headingItemProvider.dispose();
		if (notItemProvider != null) notItemProvider.dispose();
		if (stringItemProvider != null) stringItemProvider.dispose();
	}

}
