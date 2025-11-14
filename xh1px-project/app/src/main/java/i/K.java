package i;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.C1197k;
import o.g1;
import o.l1;

/* loaded from: classes.dex */
public final class K extends AbstractC0862a {

    /* renamed from: b, reason: collision with root package name */
    public final l1 f11614b;

    /* renamed from: c, reason: collision with root package name */
    public final Window.Callback f11615c;

    /* renamed from: d, reason: collision with root package name */
    public final J f11616d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11617e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11618f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11619g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f11620h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final L5.x f11621i = new L5.x(7, this);

    public K(Toolbar toolbar, CharSequence charSequence, x xVar) {
        J j = new J(this);
        toolbar.getClass();
        l1 l1Var = new l1(toolbar, false);
        this.f11614b = l1Var;
        xVar.getClass();
        this.f11615c = xVar;
        l1Var.k = xVar;
        toolbar.setOnMenuItemClickListener(j);
        if (!l1Var.f13306g) {
            l1Var.f13307h = charSequence;
            if ((l1Var.f13301b & 8) != 0) {
                Toolbar toolbar2 = l1Var.f13300a;
                toolbar2.setTitle(charSequence);
                if (l1Var.f13306g) {
                    P.O.n(toolbar2.getRootView(), charSequence);
                }
            }
        }
        this.f11616d = new J(this);
    }

    public final Menu B() {
        boolean z8 = this.f11618f;
        l1 l1Var = this.f11614b;
        if (!z8) {
            N.f fVar = new N.f(3, this);
            W5.a aVar = new W5.a(15, this);
            Toolbar toolbar = l1Var.f13300a;
            toolbar.f8473Q = fVar;
            toolbar.f8474R = aVar;
            ActionMenuView actionMenuView = toolbar.f8480d;
            if (actionMenuView != null) {
                actionMenuView.f8399x = fVar;
                actionMenuView.f8400y = aVar;
            }
            this.f11618f = true;
        }
        return l1Var.f13300a.getMenu();
    }

    @Override // i.AbstractC0862a
    public final boolean a() {
        C1197k c1197k;
        ActionMenuView actionMenuView = this.f11614b.f13300a.f8480d;
        if (actionMenuView != null && (c1197k = actionMenuView.f8398w) != null && c1197k.c()) {
            return true;
        }
        return false;
    }

    @Override // i.AbstractC0862a
    public final boolean b() {
        n.o oVar;
        g1 g1Var = this.f11614b.f13300a.f8472P;
        if (g1Var != null && (oVar = g1Var.f13259e) != null) {
            if (g1Var == null) {
                oVar = null;
            }
            if (oVar != null) {
                oVar.collapseActionView();
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // i.AbstractC0862a
    public final void e(boolean z8) {
        if (z8 != this.f11619g) {
            this.f11619g = z8;
            ArrayList arrayList = this.f11620h;
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    @Override // i.AbstractC0862a
    public final int g() {
        return this.f11614b.f13301b;
    }

    @Override // i.AbstractC0862a
    public final Context i() {
        return this.f11614b.f13300a.getContext();
    }

    @Override // i.AbstractC0862a
    public final boolean k() {
        l1 l1Var = this.f11614b;
        Toolbar toolbar = l1Var.f13300a;
        L5.x xVar = this.f11621i;
        toolbar.removeCallbacks(xVar);
        Toolbar toolbar2 = l1Var.f13300a;
        WeakHashMap weakHashMap = P.O.f4214a;
        toolbar2.postOnAnimation(xVar);
        return true;
    }

    @Override // i.AbstractC0862a
    public final void n() {
        this.f11614b.f13300a.removeCallbacks(this.f11621i);
    }

    @Override // i.AbstractC0862a
    public final boolean o(int i4, KeyEvent keyEvent) {
        Menu B8 = B();
        if (B8 == null) {
            return false;
        }
        boolean z8 = true;
        if (KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() == 1) {
            z8 = false;
        }
        B8.setQwertyMode(z8);
        return B8.performShortcut(i4, keyEvent, 0);
    }

    @Override // i.AbstractC0862a
    public final boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    @Override // i.AbstractC0862a
    public final boolean q() {
        return this.f11614b.f13300a.v();
    }

    @Override // i.AbstractC0862a
    public final void t(boolean z8) {
        l1 l1Var = this.f11614b;
        l1Var.a((l1Var.f13301b & (-5)) | 4);
    }

    @Override // i.AbstractC0862a
    public final void u() {
        l1 l1Var = this.f11614b;
        l1Var.a((l1Var.f13301b & (-3)) | 2);
    }

    @Override // i.AbstractC0862a
    public final void x(CharSequence charSequence) {
        l1 l1Var = this.f11614b;
        if (!l1Var.f13306g) {
            Toolbar toolbar = l1Var.f13300a;
            l1Var.f13307h = charSequence;
            if ((l1Var.f13301b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (l1Var.f13306g) {
                    P.O.n(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // i.AbstractC0862a
    public final void m() {
    }

    @Override // i.AbstractC0862a
    public final void s(boolean z8) {
    }

    @Override // i.AbstractC0862a
    public final void v(boolean z8) {
    }
}
