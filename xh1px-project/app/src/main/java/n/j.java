package n;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final m f12634d;

    /* renamed from: e, reason: collision with root package name */
    public int f12635e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12636f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f12637g;

    /* renamed from: h, reason: collision with root package name */
    public final LayoutInflater f12638h;

    /* renamed from: i, reason: collision with root package name */
    public final int f12639i;

    public j(m mVar, LayoutInflater layoutInflater, boolean z8, int i4) {
        this.f12637g = z8;
        this.f12638h = layoutInflater;
        this.f12634d = mVar;
        this.f12639i = i4;
        a();
    }

    public final void a() {
        m mVar = this.f12634d;
        o oVar = mVar.f12660v;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.j;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((o) arrayList.get(i4)) == oVar) {
                    this.f12635e = i4;
                    return;
                }
            }
        }
        this.f12635e = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i4) {
        ArrayList l6;
        boolean z8 = this.f12637g;
        m mVar = this.f12634d;
        if (z8) {
            mVar.i();
            l6 = mVar.j;
        } else {
            l6 = mVar.l();
        }
        int i8 = this.f12635e;
        if (i8 >= 0 && i4 >= i8) {
            i4++;
        }
        return (o) l6.get(i4);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l6;
        boolean z8 = this.f12637g;
        m mVar = this.f12634d;
        if (z8) {
            mVar.i();
            l6 = mVar.j;
        } else {
            l6 = mVar.l();
        }
        if (this.f12635e < 0) {
            return l6.size();
        }
        return l6.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        int i8;
        boolean z8 = false;
        if (view == null) {
            view = this.f12638h.inflate(this.f12639i, viewGroup, false);
        }
        int i9 = getItem(i4).f12670b;
        int i10 = i4 - 1;
        if (i10 >= 0) {
            i8 = getItem(i10).f12670b;
        } else {
            i8 = i9;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f12634d.m() && i9 != i8) {
            z8 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z8);
        z zVar = (z) view;
        if (this.f12636f) {
            listMenuItemView.setForceShowIcon(true);
        }
        zVar.a(getItem(i4));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
