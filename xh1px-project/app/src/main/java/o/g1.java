package o;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import m.InterfaceC1038a;
import n.SubMenuC1103E;

/* loaded from: classes.dex */
public final class g1 implements n.y {

    /* renamed from: d, reason: collision with root package name */
    public n.m f13258d;

    /* renamed from: e, reason: collision with root package name */
    public n.o f13259e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Toolbar f13260f;

    public g1(Toolbar toolbar) {
        this.f13260f = toolbar;
    }

    @Override // n.y
    public final boolean f(n.o oVar) {
        Toolbar toolbar = this.f13260f;
        toolbar.c();
        ViewParent parent = toolbar.k.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.k);
            }
            toolbar.addView(toolbar.k);
        }
        View actionView = oVar.getActionView();
        toolbar.f8486l = actionView;
        this.f13259e = oVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f8486l);
            }
            h1 h8 = Toolbar.h();
            h8.f13263a = (toolbar.f8491q & 112) | 8388611;
            h8.f13264b = 2;
            toolbar.f8486l.setLayoutParams(h8);
            toolbar.addView(toolbar.f8486l);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((h1) childAt.getLayoutParams()).f13264b != 2 && childAt != toolbar.f8480d) {
                toolbar.removeViewAt(childCount);
                toolbar.f8465H.add(childAt);
            }
        }
        toolbar.requestLayout();
        oVar.f12668C = true;
        oVar.f12680n.p(false);
        KeyEvent.Callback callback = toolbar.f8486l;
        if (callback instanceof InterfaceC1038a) {
            ((InterfaceC1038a) callback).onActionViewExpanded();
        }
        toolbar.w();
        return true;
    }

    @Override // n.y
    public final void g(boolean z8) {
        if (this.f13259e != null) {
            n.m mVar = this.f13258d;
            if (mVar != null) {
                int size = mVar.f12646f.size();
                for (int i4 = 0; i4 < size; i4++) {
                    if (this.f13258d.getItem(i4) == this.f13259e) {
                        return;
                    }
                }
            }
            m(this.f13259e);
        }
    }

    @Override // n.y
    public final int getId() {
        return 0;
    }

    @Override // n.y
    public final void h(Context context, n.m mVar) {
        n.o oVar;
        n.m mVar2 = this.f13258d;
        if (mVar2 != null && (oVar = this.f13259e) != null) {
            mVar2.d(oVar);
        }
        this.f13258d = mVar;
    }

    @Override // n.y
    public final boolean i(SubMenuC1103E subMenuC1103E) {
        return false;
    }

    @Override // n.y
    public final boolean j() {
        return false;
    }

    @Override // n.y
    public final Parcelable k() {
        return null;
    }

    @Override // n.y
    public final boolean m(n.o oVar) {
        Toolbar toolbar = this.f13260f;
        KeyEvent.Callback callback = toolbar.f8486l;
        if (callback instanceof InterfaceC1038a) {
            ((InterfaceC1038a) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f8486l);
        toolbar.removeView(toolbar.k);
        toolbar.f8486l = null;
        ArrayList arrayList = toolbar.f8465H;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f13259e = null;
        toolbar.requestLayout();
        oVar.f12668C = false;
        oVar.f12680n.p(false);
        toolbar.w();
        return true;
    }

    @Override // n.y
    public final void d(Parcelable parcelable) {
    }

    @Override // n.y
    public final void a(n.m mVar, boolean z8) {
    }
}
