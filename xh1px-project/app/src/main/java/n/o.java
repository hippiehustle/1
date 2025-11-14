package n;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o implements J.a {

    /* renamed from: A, reason: collision with root package name */
    public p f12666A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f12667B;

    /* renamed from: a, reason: collision with root package name */
    public final int f12669a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12670b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12671c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12672d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f12673e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f12674f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f12675g;

    /* renamed from: h, reason: collision with root package name */
    public char f12676h;
    public char j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f12678l;

    /* renamed from: n, reason: collision with root package name */
    public final m f12680n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC1103E f12681o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f12682p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f12683q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f12684r;

    /* renamed from: y, reason: collision with root package name */
    public int f12691y;

    /* renamed from: z, reason: collision with root package name */
    public View f12692z;

    /* renamed from: i, reason: collision with root package name */
    public int f12677i = 4096;
    public int k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f12679m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f12685s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f12686t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f12687u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f12688v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f12689w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f12690x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f12668C = false;

    public o(m mVar, int i4, int i8, int i9, int i10, CharSequence charSequence, int i11) {
        this.f12680n = mVar;
        this.f12669a = i8;
        this.f12670b = i4;
        this.f12671c = i9;
        this.f12672d = i10;
        this.f12673e = charSequence;
        this.f12691y = i11;
    }

    public static void c(StringBuilder sb, int i4, int i8, String str) {
        if ((i4 & i8) == i8) {
            sb.append(str);
        }
    }

    @Override // J.a
    public final p a() {
        return this.f12666A;
    }

    @Override // J.a
    public final J.a b(p pVar) {
        this.f12692z = null;
        this.f12666A = pVar;
        this.f12680n.p(true);
        p pVar2 = this.f12666A;
        if (pVar2 != null) {
            pVar2.f12693a = new W5.a(19, this);
            pVar2.f12694b.setVisibilityListener(pVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f12691y & 8) == 0) {
            return false;
        }
        if (this.f12692z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f12667B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f12680n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f12689w && (this.f12687u || this.f12688v)) {
            drawable = drawable.mutate();
            if (this.f12687u) {
                drawable.setTintList(this.f12685s);
            }
            if (this.f12688v) {
                drawable.setTintMode(this.f12686t);
            }
            this.f12689w = false;
        }
        return drawable;
    }

    public final boolean e() {
        p pVar;
        if ((this.f12691y & 8) != 0) {
            if (this.f12692z == null && (pVar = this.f12666A) != null) {
                this.f12692z = pVar.f12694b.onCreateActionView(this);
            }
            if (this.f12692z != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (e()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.f12667B;
            if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
                return false;
            }
            return this.f12680n.f(this);
        }
        return false;
    }

    public final void f(boolean z8) {
        int i4;
        int i8 = this.f12690x & (-5);
        if (z8) {
            i4 = 4;
        } else {
            i4 = 0;
        }
        this.f12690x = i4 | i8;
    }

    public final void g(boolean z8) {
        if (z8) {
            this.f12690x |= 32;
        } else {
            this.f12690x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f12692z;
        if (view != null) {
            return view;
        }
        p pVar = this.f12666A;
        if (pVar != null) {
            View onCreateActionView = pVar.f12694b.onCreateActionView(this);
            this.f12692z = onCreateActionView;
            return onCreateActionView;
        }
        return null;
    }

    @Override // J.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // J.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f12683q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f12670b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f12678l;
        if (drawable != null) {
            return d(drawable);
        }
        int i4 = this.f12679m;
        if (i4 != 0) {
            Drawable k = h4.g.k(this.f12680n.f12641a, i4);
            this.f12679m = 0;
            this.f12678l = k;
            return d(k);
        }
        return null;
    }

    @Override // J.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f12685s;
    }

    @Override // J.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f12686t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f12675g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f12669a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // J.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f12677i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f12676h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f12671c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f12681o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f12673e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f12674f;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f12673e;
    }

    @Override // J.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f12684r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        if (this.f12681o != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f12668C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f12690x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f12690x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f12690x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        p pVar = this.f12666A;
        if (pVar != null && pVar.f12694b.overridesItemVisibility()) {
            if ((this.f12690x & 8) != 0 || !this.f12666A.f12694b.isVisible()) {
                return false;
            }
            return true;
        }
        if ((this.f12690x & 8) != 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i4;
        this.f12692z = view;
        this.f12666A = null;
        if (view != null && view.getId() == -1 && (i4 = this.f12669a) > 0) {
            view.setId(i4);
        }
        m mVar = this.f12680n;
        mVar.k = true;
        mVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6) {
        if (this.j == c6) {
            return this;
        }
        this.j = Character.toLowerCase(c6);
        this.f12680n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z8) {
        int i4 = this.f12690x;
        int i8 = (z8 ? 1 : 0) | (i4 & (-2));
        this.f12690x = i8;
        if (i4 != i8) {
            this.f12680n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z8) {
        boolean z9;
        int i4;
        int i8 = this.f12690x;
        int i9 = 2;
        if ((i8 & 4) != 0) {
            m mVar = this.f12680n;
            ArrayList arrayList = mVar.f12646f;
            int size = arrayList.size();
            mVar.w();
            for (int i10 = 0; i10 < size; i10++) {
                o oVar = (o) arrayList.get(i10);
                if (oVar.f12670b == this.f12670b && (oVar.f12690x & 4) != 0 && oVar.isCheckable()) {
                    if (oVar == this) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    int i11 = oVar.f12690x;
                    int i12 = i11 & (-3);
                    if (z9) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i13 = i4 | i12;
                    oVar.f12690x = i13;
                    if (i11 != i13) {
                        oVar.f12680n.p(false);
                    }
                }
            }
            mVar.v();
            return this;
        }
        int i14 = i8 & (-3);
        if (!z8) {
            i9 = 0;
        }
        int i15 = i14 | i9;
        this.f12690x = i15;
        if (i8 != i15) {
            this.f12680n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z8) {
        if (z8) {
            this.f12690x |= 16;
        } else {
            this.f12690x &= -17;
        }
        this.f12680n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f12679m = 0;
        this.f12678l = drawable;
        this.f12689w = true;
        this.f12680n.p(false);
        return this;
    }

    @Override // J.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f12685s = colorStateList;
        this.f12687u = true;
        this.f12689w = true;
        this.f12680n.p(false);
        return this;
    }

    @Override // J.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f12686t = mode;
        this.f12688v = true;
        this.f12689w = true;
        this.f12680n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f12675g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6) {
        if (this.f12676h == c6) {
            return this;
        }
        this.f12676h = c6;
        this.f12680n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f12667B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f12682p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c9) {
        this.f12676h = c6;
        this.j = Character.toLowerCase(c9);
        this.f12680n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i4) {
        int i8 = i4 & 3;
        if (i8 != 0 && i8 != 1 && i8 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f12691y = i4;
        m mVar = this.f12680n;
        mVar.k = true;
        mVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i4) {
        setShowAsAction(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f12673e = charSequence;
        this.f12680n.p(false);
        SubMenuC1103E subMenuC1103E = this.f12681o;
        if (subMenuC1103E != null) {
            subMenuC1103E.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f12674f = charSequence;
        this.f12680n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z8) {
        int i4;
        int i8 = this.f12690x;
        int i9 = i8 & (-9);
        if (z8) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        int i10 = i4 | i9;
        this.f12690x = i10;
        if (i8 != i10) {
            m mVar = this.f12680n;
            mVar.f12648h = true;
            mVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f12673e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // J.a, android.view.MenuItem
    public final J.a setContentDescription(CharSequence charSequence) {
        this.f12683q = charSequence;
        this.f12680n.p(false);
        return this;
    }

    @Override // J.a, android.view.MenuItem
    public final J.a setTooltipText(CharSequence charSequence) {
        this.f12684r = charSequence;
        this.f12680n.p(false);
        return this;
    }

    @Override // J.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6, int i4) {
        if (this.j == c6 && this.k == i4) {
            return this;
        }
        this.j = Character.toLowerCase(c6);
        this.k = KeyEvent.normalizeMetaState(i4);
        this.f12680n.p(false);
        return this;
    }

    @Override // J.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6, int i4) {
        if (this.f12676h == c6 && this.f12677i == i4) {
            return this;
        }
        this.f12676h = c6;
        this.f12677i = KeyEvent.normalizeMetaState(i4);
        this.f12680n.p(false);
        return this;
    }

    @Override // J.a, android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c9, int i4, int i8) {
        this.f12676h = c6;
        this.f12677i = KeyEvent.normalizeMetaState(i4);
        this.j = Character.toLowerCase(c9);
        this.k = KeyEvent.normalizeMetaState(i8);
        this.f12680n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i4) {
        this.f12678l = null;
        this.f12679m = i4;
        this.f12689w = true;
        this.f12680n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i4) {
        setTitle(this.f12680n.f12641a.getString(i4));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i4) {
        int i8;
        Context context = this.f12680n.f12641a;
        View inflate = LayoutInflater.from(context).inflate(i4, (ViewGroup) new LinearLayout(context), false);
        this.f12692z = inflate;
        this.f12666A = null;
        if (inflate != null && inflate.getId() == -1 && (i8 = this.f12669a) > 0) {
            inflate.setId(i8);
        }
        m mVar = this.f12680n;
        mVar.k = true;
        mVar.p(true);
        return this;
    }
}
