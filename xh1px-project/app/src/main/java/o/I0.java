package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* loaded from: classes.dex */
public final class I0 extends C1213s0 {

    /* renamed from: p, reason: collision with root package name */
    public final int f13086p;

    /* renamed from: q, reason: collision with root package name */
    public final int f13087q;

    /* renamed from: r, reason: collision with root package name */
    public F0 f13088r;

    /* renamed from: s, reason: collision with root package name */
    public n.o f13089s;

    public I0(Context context, boolean z8) {
        super(context, z8);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f13086p = 21;
            this.f13087q = 22;
        } else {
            this.f13086p = 22;
            this.f13087q = 21;
        }
    }

    @Override // o.C1213s0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        n.j jVar;
        int i4;
        n.o oVar;
        int pointToPosition;
        int i8;
        if (this.f13088r != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i4 = headerViewListAdapter.getHeadersCount();
                jVar = (n.j) headerViewListAdapter.getWrappedAdapter();
            } else {
                jVar = (n.j) adapter;
                i4 = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i8 = pointToPosition - i4) >= 0 && i8 < jVar.getCount()) {
                oVar = jVar.getItem(i8);
            } else {
                oVar = null;
            }
            n.o oVar2 = this.f13089s;
            if (oVar2 != oVar) {
                n.m mVar = jVar.f12634d;
                if (oVar2 != null) {
                    this.f13088r.i(mVar, oVar2);
                }
                this.f13089s = oVar;
                if (oVar != null) {
                    this.f13088r.I(mVar, oVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        n.j jVar;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i4 == this.f13086p) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView != null && i4 == this.f13087q) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                jVar = (n.j) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                jVar = (n.j) adapter;
            }
            jVar.f12634d.c(false);
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    public void setHoverListener(F0 f02) {
        this.f13088r = f02;
    }

    @Override // o.C1213s0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
