package n;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f12698a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f12699b;

    public s(t tVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f12699b = tVar;
        this.f12698a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f12698a.onMenuItemClick(this.f12699b.g(menuItem));
    }
}
