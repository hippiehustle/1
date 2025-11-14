package n;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class u implements InterfaceC1101C, y, AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public Rect f12702d;

    public static int o(ListAdapter listAdapter, Context context, int i4) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i8 = 0;
        int i9 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i10 = 0; i10 < count; i10++) {
            int itemViewType = listAdapter.getItemViewType(i10);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i10, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i4) {
                return i4;
            }
            if (measuredWidth > i8) {
                i8 = measuredWidth;
            }
        }
        return i8;
    }

    @Override // n.y
    public final boolean f(o oVar) {
        return false;
    }

    @Override // n.y
    public final int getId() {
        return 0;
    }

    @Override // n.y
    public final boolean m(o oVar) {
        return false;
    }

    public abstract void n(m mVar);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j) {
        j jVar;
        int i8;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            jVar = (j) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            jVar = (j) listAdapter;
        }
        m mVar = jVar.f12634d;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i4);
        if (!(this instanceof ViewOnKeyListenerC1110g)) {
            i8 = 0;
        } else {
            i8 = 4;
        }
        mVar.q(menuItem, this, i8);
    }

    public abstract void p(View view);

    public abstract void q(boolean z8);

    public abstract void r(int i4);

    public abstract void s(int i4);

    public abstract void t(PopupWindow.OnDismissListener onDismissListener);

    public abstract void u(boolean z8);

    public abstract void v(int i4);

    @Override // n.y
    public final void h(Context context, m mVar) {
    }
}
