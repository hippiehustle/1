package n;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import i.C0865d;
import i.DialogInterfaceC0869h;

/* loaded from: classes.dex */
public final class i implements y, AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public Context f12628d;

    /* renamed from: e, reason: collision with root package name */
    public LayoutInflater f12629e;

    /* renamed from: f, reason: collision with root package name */
    public m f12630f;

    /* renamed from: g, reason: collision with root package name */
    public ExpandedMenuView f12631g;

    /* renamed from: h, reason: collision with root package name */
    public x f12632h;

    /* renamed from: i, reason: collision with root package name */
    public h f12633i;

    public i(ContextWrapper contextWrapper) {
        this.f12628d = contextWrapper;
        this.f12629e = LayoutInflater.from(contextWrapper);
    }

    @Override // n.y
    public final void a(m mVar, boolean z8) {
        x xVar = this.f12632h;
        if (xVar != null) {
            xVar.a(mVar, z8);
        }
    }

    @Override // n.y
    public final void d(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f12631g.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // n.y
    public final boolean f(o oVar) {
        return false;
    }

    @Override // n.y
    public final void g(boolean z8) {
        h hVar = this.f12633i;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // n.y
    public final int getId() {
        return 0;
    }

    @Override // n.y
    public final void h(Context context, m mVar) {
        if (this.f12628d != null) {
            this.f12628d = context;
            if (this.f12629e == null) {
                this.f12629e = LayoutInflater.from(context);
            }
        }
        this.f12630f = mVar;
        h hVar = this.f12633i;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.DialogInterface$OnClickListener, android.content.DialogInterface$OnKeyListener, n.x, java.lang.Object, android.content.DialogInterface$OnDismissListener, n.n] */
    @Override // n.y
    public final boolean i(SubMenuC1103E subMenuC1103E) {
        boolean hasVisibleItems = subMenuC1103E.hasVisibleItems();
        Context context = subMenuC1103E.f12641a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f12663d = subMenuC1103E;
        M.i iVar = new M.i(context);
        C0865d c0865d = (C0865d) iVar.f3288e;
        i iVar2 = new i(c0865d.f11660a);
        obj.f12665f = iVar2;
        iVar2.f12632h = obj;
        subMenuC1103E.b(iVar2, context);
        i iVar3 = obj.f12665f;
        if (iVar3.f12633i == null) {
            iVar3.f12633i = new h(iVar3);
        }
        c0865d.f11672o = iVar3.f12633i;
        c0865d.f11673p = obj;
        View view = subMenuC1103E.f12653o;
        if (view != null) {
            c0865d.f11664e = view;
        } else {
            c0865d.f11662c = subMenuC1103E.f12652n;
            c0865d.f11663d = subMenuC1103E.f12651m;
        }
        c0865d.f11671n = obj;
        DialogInterfaceC0869h c6 = iVar.c();
        obj.f12664e = c6;
        c6.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f12664e.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f12664e.show();
        x xVar = this.f12632h;
        if (xVar != null) {
            xVar.h(subMenuC1103E);
            return true;
        }
        return true;
    }

    @Override // n.y
    public final boolean j() {
        return false;
    }

    @Override // n.y
    public final Parcelable k() {
        if (this.f12631g == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f12631g;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // n.y
    public final void l(x xVar) {
        throw null;
    }

    @Override // n.y
    public final boolean m(o oVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j) {
        this.f12630f.q(this.f12633i.getItem(i4), this, 0);
    }
}
