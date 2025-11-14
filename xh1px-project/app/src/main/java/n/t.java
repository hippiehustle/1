package n;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class t extends C5.p implements MenuItem {

    /* renamed from: c, reason: collision with root package name */
    public final J.a f12700c;

    /* renamed from: d, reason: collision with root package name */
    public Method f12701d;

    public t(Context context, J.a aVar) {
        super(context);
        if (aVar != null) {
            this.f12700c = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f12700c.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f12700c.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        p a3 = this.f12700c.a();
        if (a3 != null) {
            return a3.f12694b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.f12700c.getActionView();
        if (actionView instanceof q) {
            return (View) ((q) actionView).f12695d;
        }
        return actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f12700c.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f12700c.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f12700c.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f12700c.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f12700c.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f12700c.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f12700c.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f12700c.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f12700c.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f12700c.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f12700c.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f12700c.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f12700c.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f12700c.getSubMenu();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f12700c.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f12700c.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f12700c.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f12700c.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f12700c.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f12700c.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f12700c.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f12700c.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f12700c.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        p pVar = new p(this, actionProvider);
        if (actionProvider == null) {
            pVar = null;
        }
        this.f12700c.b(pVar);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new q(view);
        }
        this.f12700c.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6) {
        this.f12700c.setAlphabeticShortcut(c6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z8) {
        this.f12700c.setCheckable(z8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z8) {
        this.f12700c.setChecked(z8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f12700c.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z8) {
        this.f12700c.setEnabled(z8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f12700c.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f12700c.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f12700c.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f12700c.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6) {
        this.f12700c.setNumericShortcut(c6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        r rVar;
        if (onActionExpandListener != null) {
            rVar = new r(this, onActionExpandListener);
        } else {
            rVar = null;
        }
        this.f12700c.setOnActionExpandListener(rVar);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        s sVar;
        if (onMenuItemClickListener != null) {
            sVar = new s(this, onMenuItemClickListener);
        } else {
            sVar = null;
        }
        this.f12700c.setOnMenuItemClickListener(sVar);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c9) {
        this.f12700c.setShortcut(c6, c9);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i4) {
        this.f12700c.setShowAsAction(i4);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i4) {
        this.f12700c.setShowAsActionFlags(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f12700c.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f12700c.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f12700c.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z8) {
        return this.f12700c.setVisible(z8);
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6, int i4) {
        this.f12700c.setAlphabeticShortcut(c6, i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i4) {
        this.f12700c.setIcon(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6, int i4) {
        this.f12700c.setNumericShortcut(c6, i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c9, int i4, int i8) {
        this.f12700c.setShortcut(c6, c9, i4, i8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i4) {
        this.f12700c.setTitle(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i4) {
        J.a aVar = this.f12700c;
        aVar.setActionView(i4);
        View actionView = aVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            aVar.setActionView(new q(actionView));
        }
        return this;
    }
}
