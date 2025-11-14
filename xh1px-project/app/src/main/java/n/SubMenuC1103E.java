package n;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: n.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC1103E extends m implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    public final o f12575A;

    /* renamed from: z, reason: collision with root package name */
    public final m f12576z;

    public SubMenuC1103E(Context context, m mVar, o oVar) {
        super(context);
        this.f12576z = mVar;
        this.f12575A = oVar;
    }

    @Override // n.m
    public final boolean d(o oVar) {
        return this.f12576z.d(oVar);
    }

    @Override // n.m
    public final boolean e(m mVar, MenuItem menuItem) {
        if (!super.e(mVar, menuItem) && !this.f12576z.e(mVar, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // n.m
    public final boolean f(o oVar) {
        return this.f12576z.f(oVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f12575A;
    }

    @Override // n.m
    public final String j() {
        int i4;
        o oVar = this.f12575A;
        if (oVar != null) {
            i4 = oVar.f12669a;
        } else {
            i4 = 0;
        }
        if (i4 == 0) {
            return null;
        }
        return A.j.l("android:menu:actionviewstates:", i4);
    }

    @Override // n.m
    public final m k() {
        return this.f12576z.k();
    }

    @Override // n.m
    public final boolean m() {
        return this.f12576z.m();
    }

    @Override // n.m
    public final boolean n() {
        return this.f12576z.n();
    }

    @Override // n.m
    public final boolean o() {
        return this.f12576z.o();
    }

    @Override // n.m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z8) {
        this.f12576z.setGroupDividerEnabled(z8);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f12575A.setIcon(drawable);
        return this;
    }

    @Override // n.m, android.view.Menu
    public final void setQwertyMode(boolean z8) {
        this.f12576z.setQwertyMode(z8);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i4) {
        u(0, null, i4, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i4) {
        u(i4, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i4) {
        this.f12575A.setIcon(i4);
        return this;
    }
}
