/**
 * Generated with Acceleo
 */
package droid.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import droid.parts.DroidViewsRepository;
import droid.parts.forms.ApplicationPropertiesEditionPartForm;
import droid.parts.forms.ApplicationUsesSDKPropertiesEditionPartForm;
import droid.parts.forms.ArrayRAPropertiesEditionPartForm;
import droid.parts.forms.ArrayResourcePropertiesEditionPartForm;
import droid.parts.forms.BitmapDrawableResourcePropertiesEditionPartForm;
import droid.parts.forms.BooleanRAPropertiesEditionPartForm;
import droid.parts.forms.BooleanResourcePropertiesEditionPartForm;
import droid.parts.forms.BooleanVAPropertiesEditionPartForm;
import droid.parts.forms.ButtonPropertiesEditionPartForm;
import droid.parts.forms.ColorRAPropertiesEditionPartForm;
import droid.parts.forms.ColorResourcePropertiesEditionPartForm;
import droid.parts.forms.ColorVAPropertiesEditionPartForm;
import droid.parts.forms.DimensionRAPropertiesEditionPartForm;
import droid.parts.forms.DimensionResourcePropertiesEditionPartForm;
import droid.parts.forms.DimensionVAPropertiesEditionPartForm;
import droid.parts.forms.DrawableRAPropertiesEditionPartForm;
import droid.parts.forms.DrawableResourcePropertiesEditionPartForm;
import droid.parts.forms.EditTextPropertiesEditionPartForm;
import droid.parts.forms.GoToURLActionPropertiesEditionPartForm;
import droid.parts.forms.ImageViewPropertiesEditionPartForm;
import droid.parts.forms.IntegerArrayResourcePropertiesEditionPartForm;
import droid.parts.forms.IntegerRAPropertiesEditionPartForm;
import droid.parts.forms.IntegerResourcePropertiesEditionPartForm;
import droid.parts.forms.IntegerVAPropertiesEditionPartForm;
import droid.parts.forms.InvokeScreenActionPropertiesEditionPartForm;
import droid.parts.forms.LayoutDimensionVAPropertiesEditionPartForm;
import droid.parts.forms.LayoutPropertiesEditionPartForm;
import droid.parts.forms.LayoutPropertiesPropertiesEditionPartForm;
import droid.parts.forms.ResourceAccessPropertiesEditionPartForm;
import droid.parts.forms.ResourcePropertiesEditionPartForm;
import droid.parts.forms.ScreenPropertiesEditionPartForm;
import droid.parts.forms.ShowLayoutActionPropertiesEditionPartForm;
import droid.parts.forms.SpinnerPropertiesEditionPartForm;
import droid.parts.forms.StringArrayResourcePropertiesEditionPartForm;
import droid.parts.forms.StringRAPropertiesEditionPartForm;
import droid.parts.forms.StringResourcePropertiesEditionPartForm;
import droid.parts.forms.StringVAPropertiesEditionPartForm;
import droid.parts.forms.TextViewPropertiesEditionPartForm;
import droid.parts.forms.TransitionDrawableResourcePropertiesEditionPartForm;
import droid.parts.forms.ViewCollectionPropertiesEditionPartForm;
import droid.parts.forms.ViewPropertiesEditionPartForm;
import droid.parts.forms.WidgetPropertiesEditionPartForm;
import droid.parts.impl.ApplicationPropertiesEditionPartImpl;
import droid.parts.impl.ApplicationUsesSDKPropertiesEditionPartImpl;
import droid.parts.impl.ArrayRAPropertiesEditionPartImpl;
import droid.parts.impl.ArrayResourcePropertiesEditionPartImpl;
import droid.parts.impl.BitmapDrawableResourcePropertiesEditionPartImpl;
import droid.parts.impl.BooleanRAPropertiesEditionPartImpl;
import droid.parts.impl.BooleanResourcePropertiesEditionPartImpl;
import droid.parts.impl.BooleanVAPropertiesEditionPartImpl;
import droid.parts.impl.ButtonPropertiesEditionPartImpl;
import droid.parts.impl.ColorRAPropertiesEditionPartImpl;
import droid.parts.impl.ColorResourcePropertiesEditionPartImpl;
import droid.parts.impl.ColorVAPropertiesEditionPartImpl;
import droid.parts.impl.DimensionRAPropertiesEditionPartImpl;
import droid.parts.impl.DimensionResourcePropertiesEditionPartImpl;
import droid.parts.impl.DimensionVAPropertiesEditionPartImpl;
import droid.parts.impl.DrawableRAPropertiesEditionPartImpl;
import droid.parts.impl.DrawableResourcePropertiesEditionPartImpl;
import droid.parts.impl.EditTextPropertiesEditionPartImpl;
import droid.parts.impl.GoToURLActionPropertiesEditionPartImpl;
import droid.parts.impl.ImageViewPropertiesEditionPartImpl;
import droid.parts.impl.IntegerArrayResourcePropertiesEditionPartImpl;
import droid.parts.impl.IntegerRAPropertiesEditionPartImpl;
import droid.parts.impl.IntegerResourcePropertiesEditionPartImpl;
import droid.parts.impl.IntegerVAPropertiesEditionPartImpl;
import droid.parts.impl.InvokeScreenActionPropertiesEditionPartImpl;
import droid.parts.impl.LayoutDimensionVAPropertiesEditionPartImpl;
import droid.parts.impl.LayoutPropertiesEditionPartImpl;
import droid.parts.impl.LayoutPropertiesPropertiesEditionPartImpl;
import droid.parts.impl.ResourceAccessPropertiesEditionPartImpl;
import droid.parts.impl.ResourcePropertiesEditionPartImpl;
import droid.parts.impl.ScreenPropertiesEditionPartImpl;
import droid.parts.impl.ShowLayoutActionPropertiesEditionPartImpl;
import droid.parts.impl.SpinnerPropertiesEditionPartImpl;
import droid.parts.impl.StringArrayResourcePropertiesEditionPartImpl;
import droid.parts.impl.StringRAPropertiesEditionPartImpl;
import droid.parts.impl.StringResourcePropertiesEditionPartImpl;
import droid.parts.impl.StringVAPropertiesEditionPartImpl;
import droid.parts.impl.TextViewPropertiesEditionPartImpl;
import droid.parts.impl.TransitionDrawableResourcePropertiesEditionPartImpl;
import droid.parts.impl.ViewCollectionPropertiesEditionPartImpl;
import droid.parts.impl.ViewPropertiesEditionPartImpl;
import droid.parts.impl.WidgetPropertiesEditionPartImpl;




/**
 * 
 * 
 */
public class DroidPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == DroidViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == DroidViewsRepository.Application.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ApplicationPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ApplicationPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.ApplicationUsesSDK.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ApplicationUsesSDKPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ApplicationUsesSDKPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.Screen.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ScreenPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ScreenPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.GoToURLAction.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new GoToURLActionPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new GoToURLActionPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.ShowLayoutAction.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ShowLayoutActionPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ShowLayoutActionPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.InvokeScreenAction.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new InvokeScreenActionPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new InvokeScreenActionPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.Layout.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new LayoutPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new LayoutPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.ViewCollection.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ViewCollectionPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ViewCollectionPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.View.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ViewPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ViewPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.Widget.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new WidgetPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new WidgetPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.TextView.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new TextViewPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new TextViewPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.Button.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ButtonPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ButtonPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.ImageView.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ImageViewPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ImageViewPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.Spinner.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new SpinnerPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new SpinnerPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.EditText.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new EditTextPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new EditTextPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.Resource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.StringResource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new StringResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new StringResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.IntegerResource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new IntegerResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new IntegerResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.BooleanResource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new BooleanResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new BooleanResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.ColorResource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ColorResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ColorResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.DimensionResource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new DimensionResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new DimensionResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.ArrayResource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ArrayResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ArrayResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.IntegerArrayResource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new IntegerArrayResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new IntegerArrayResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.StringArrayResource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new StringArrayResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new StringArrayResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.DrawableResource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new DrawableResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new DrawableResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.BitmapDrawableResource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new BitmapDrawableResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new BitmapDrawableResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.TransitionDrawableResource.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new TransitionDrawableResourcePropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new TransitionDrawableResourcePropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.StringVA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new StringVAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new StringVAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.IntegerVA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new IntegerVAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new IntegerVAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.BooleanVA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new BooleanVAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new BooleanVAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.ColorVA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ColorVAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ColorVAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.DimensionVA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new DimensionVAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new DimensionVAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.LayoutDimensionVA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new LayoutDimensionVAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new LayoutDimensionVAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.ResourceAccess.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ResourceAccessPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ResourceAccessPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.StringRA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new StringRAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new StringRAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.IntegerRA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new IntegerRAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new IntegerRAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.BooleanRA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new BooleanRAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new BooleanRAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.ColorRA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ColorRAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ColorRAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.DimensionRA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new DimensionRAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new DimensionRAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.ArrayRA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new ArrayRAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new ArrayRAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.DrawableRA.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new DrawableRAPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new DrawableRAPropertiesEditionPartForm(component);
		}
		if (key == DroidViewsRepository.LayoutProperties.class) {
			if (kind == DroidViewsRepository.SWT_KIND)
				return new LayoutPropertiesPropertiesEditionPartImpl(component);
			if (kind == DroidViewsRepository.FORM_KIND)
				return new LayoutPropertiesPropertiesEditionPartForm(component);
		}
		return null;
	}

}
