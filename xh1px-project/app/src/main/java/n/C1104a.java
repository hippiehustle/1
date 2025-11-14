package n;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1104a implements J.a {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f12577a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f12578b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f12579c;

    /* renamed from: d, reason: collision with root package name */
    public char f12580d;

    /* renamed from: e, reason: collision with root package name */
    public int f12581e;

    /* renamed from: f, reason: collision with root package name */
    public char f12582f;

    /* renamed from: g, reason: collision with root package name */
    public int f12583g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f12584h;

    /* renamed from: i, reason: collision with root package name */
    public Context f12585i;
    public CharSequence j;
    public CharSequence k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f12586l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f12587m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f12588n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f12589o;

    /* renamed from: p, reason: collision with root package name */
    public int f12590p;

    @Override // J.a
    public final p a() {
        return null;
    }

    @Override // J.a
    public final J.a b(p pVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f12584h;
        if (drawable != null) {
            if (this.f12588n || this.f12589o) {
                this.f12584h = drawable;
                Drawable mutate = drawable.mutate();
                this.f12584h = mutate;
                if (this.f12588n) {
                    mutate.setTintList(this.f12586l);
                }
                if (this.f12589o) {
                    this.f12584h.setTintMode(this.f12587m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // J.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f12583g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f12582f;
    }

    @Override // J.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f12584h;
    }

    @Override // J.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f12586l;
    }

    @Override // J.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f12587m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f12579c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // J.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f12581e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f12580d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f12577a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f12578b;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f12577a;
    }

    @Override // J.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f12590p & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f12590p & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f12590p & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        if ((this.f12590p & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6) {
        this.f12582f = Character.toLowerCase(c6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z8) {
        this.f12590p = (z8 ? 1 : 0) | (this.f12590p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z8) {
        int i4;
        int i8 = this.f12590p & (-3);
        if (z8) {
            i4 = 2;
        } else {
            i4 = 0;
        }
        this.f12590p = i4 | i8;
        return this;
    }

    @Override // J.a, android.view.MenuItem
    public final J.a setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z8) {
        int i4;
        int i8 = this.f12590p & (-17);
        if (z8) {
            i4 = 16;
        } else {
            i4 = 0;
        }
        this.f12590p = i4 | i8;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f12584h = drawable;
        c();
        return this;
    }

    @Override // J.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f12586l = colorStateList;
        this.f12588n = true;
        c();
        return this;
    }

    @Override // J.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f12587m = mode;
        this.f12589o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f12579c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6) {
        this.f12580d = c6;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c9) {
        this.f12580d = c6;
        this.f12582f = Character.toLowerCase(c9);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f12577a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f12578b = charSequence;
        return this;
    }

    @Override // J.a, android.view.MenuItem
    public final J.a setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z8) {
        int i4 = 8;
        int i8 = this.f12590p & 8;
        if (z8) {
            i4 = 0;
        }
        this.f12590p = i8 | i4;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // J.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6, int i4) {
        this.f12582f = Character.toLowerCase(c6);
        this.f12583g = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // J.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6, int i4) {
        this.f12580d = c6;
        this.f12581e = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i4) {
        this.f12577a = this.f12585i.getResources().getString(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i4) {
        this.f12584h = this.f12585i.getDrawable(i4);
        c();
        return this;
    }

    @Override // J.a, android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c9, int i4, int i8) {
        this.f12580d = c6;
        this.f12581e = KeyEvent.normalizeMetaState(i4);
        this.f12582f = Character.toLowerCase(c9);
        this.f12583g = KeyEvent.normalizeMetaState(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i4) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i4) {
        return this;
    }
}
