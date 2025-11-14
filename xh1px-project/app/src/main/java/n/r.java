package n;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class r implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f12696a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f12697b;

    public r(t tVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f12697b = tVar;
        this.f12696a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f12696a.onMenuItemActionCollapse(this.f12697b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f12696a.onMenuItemActionExpand(this.f12697b.g(menuItem));
    }
}
