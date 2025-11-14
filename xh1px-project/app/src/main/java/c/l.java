package c;

import a.AbstractC0405a;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C0512x;
import androidx.lifecycle.EnumC0504o;
import androidx.lifecycle.InterfaceC0499j;
import androidx.lifecycle.N;
import androidx.lifecycle.P;
import androidx.lifecycle.U;
import androidx.lifecycle.X;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import com.buzbuz.smartautoclicker.R;
import d.C0591a;
import e.AbstractC0627c;
import e.InterfaceC0626b;
import g0.I;
import i.AbstractActivityC0870i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k0.AbstractC0948c;
import k0.C0949d;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public abstract class l extends E.g implements f0, InterfaceC0499j, B0.f {

    /* renamed from: e */
    public final C0591a f9334e = new C0591a();

    /* renamed from: f */
    public final A4.c f9335f;

    /* renamed from: g */
    public final C0512x f9336g;

    /* renamed from: h */
    public final A.i f9337h;

    /* renamed from: i */
    public e0 f9338i;
    public X j;
    public C0544A k;

    /* renamed from: l */
    public final k f9339l;

    /* renamed from: m */
    public final P6.s f9340m;

    /* renamed from: n */
    public final AtomicInteger f9341n;

    /* renamed from: o */
    public final C0553g f9342o;

    /* renamed from: p */
    public final CopyOnWriteArrayList f9343p;

    /* renamed from: q */
    public final CopyOnWriteArrayList f9344q;

    /* renamed from: r */
    public final CopyOnWriteArrayList f9345r;

    /* renamed from: s */
    public final CopyOnWriteArrayList f9346s;

    /* renamed from: t */
    public final CopyOnWriteArrayList f9347t;

    /* renamed from: u */
    public boolean f9348u;

    /* renamed from: v */
    public boolean f9349v;

    public l() {
        AbstractActivityC0870i abstractActivityC0870i = (AbstractActivityC0870i) this;
        this.f9335f = new A4.c(new E.a(8, abstractActivityC0870i));
        C0512x c0512x = new C0512x(this);
        this.f9336g = c0512x;
        A.i iVar = new A.i(new C0.b(this, new B0.e(0, this)));
        this.f9337h = iVar;
        this.k = null;
        k kVar = new k(abstractActivityC0870i);
        this.f9339l = kVar;
        this.f9340m = new P6.s(kVar, new B0.e(17, abstractActivityC0870i));
        this.f9341n = new AtomicInteger();
        this.f9342o = new C0553g(abstractActivityC0870i);
        this.f9343p = new CopyOnWriteArrayList();
        this.f9344q = new CopyOnWriteArrayList();
        this.f9345r = new CopyOnWriteArrayList();
        this.f9346s = new CopyOnWriteArrayList();
        this.f9347t = new CopyOnWriteArrayList();
        this.f9348u = false;
        this.f9349v = false;
        c0512x.a(new C0554h(abstractActivityC0870i, 0));
        c0512x.a(new C0554h(abstractActivityC0870i, 1));
        c0512x.a(new C0554h(abstractActivityC0870i, 2));
        iVar.h();
        U.d(this);
        ((A.i) iVar.f89f).k("android:support:activity-result", new C0550d(abstractActivityC0870i, 0));
        j(new C0551e(abstractActivityC0870i, 0));
    }

    public static /* synthetic */ void h(l lVar) {
        super.onBackPressed();
    }

    @Override // B0.f
    public final A.i b() {
        return (A.i) this.f9337h.f89f;
    }

    @Override // androidx.lifecycle.InterfaceC0499j
    public b0 d() {
        Bundle bundle;
        if (this.j == null) {
            Application application = getApplication();
            if (getIntent() != null) {
                bundle = getIntent().getExtras();
            } else {
                bundle = null;
            }
            this.j = new X(application, this, bundle);
        }
        return this.j;
    }

    @Override // androidx.lifecycle.InterfaceC0499j
    public final AbstractC0948c e() {
        C0949d c0949d = new C0949d(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c0949d.f11951a;
        if (application != null) {
            linkedHashMap.put(a0.f8826d, getApplication());
        }
        linkedHashMap.put(U.f8808a, this);
        linkedHashMap.put(U.f8809b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(U.f8810c, getIntent().getExtras());
        }
        return c0949d;
    }

    @Override // androidx.lifecycle.f0
    public final e0 f() {
        if (getApplication() != null) {
            if (this.f9338i == null) {
                j jVar = (j) getLastNonConfigurationInstance();
                if (jVar != null) {
                    this.f9338i = jVar.f9329a;
                }
                if (this.f9338i == null) {
                    this.f9338i = new e0();
                }
            }
            return this.f9338i;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // androidx.lifecycle.InterfaceC0510v
    public final C0512x g() {
        return this.f9336g;
    }

    public final void i(O.a aVar) {
        this.f9343p.add(aVar);
    }

    public final void j(d.b bVar) {
        C0591a c0591a = this.f9334e;
        c0591a.getClass();
        if (c0591a.f10363b != null) {
            bVar.a();
        }
        c0591a.f10362a.add(bVar);
    }

    public final C0544A k() {
        if (this.k == null) {
            this.k = new C0544A(new L5.x(3, this));
            this.f9336g.a(new B0.b(2, this));
        }
        return this.k;
    }

    public final void l() {
        View decorView = getWindow().getDecorView();
        o6.j.e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        o6.j.e(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        o6.j.e(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        o6.j.e(decorView4, "<this>");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        o6.j.e(decorView5, "<this>");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final AbstractC0627c m(AbstractC0405a abstractC0405a, InterfaceC0626b interfaceC0626b) {
        return this.f9342o.d("activity_rq#" + this.f9341n.getAndIncrement(), this, abstractC0405a, interfaceC0626b);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i4, int i8, Intent intent) {
        if (!this.f9342o.a(i4, i8, intent)) {
            super.onActivityResult(i4, i8, intent);
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        k().a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f9343p.iterator();
        while (it.hasNext()) {
            ((O.a) it.next()).accept(configuration);
        }
    }

    @Override // E.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f9337h.i(bundle);
        C0591a c0591a = this.f9334e;
        c0591a.getClass();
        c0591a.f10363b = this;
        Iterator it = c0591a.f10362a.iterator();
        while (it.hasNext()) {
            ((d.b) it.next()).a();
        }
        super.onCreate(bundle);
        int i4 = P.f8802e;
        N.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i4, Menu menu) {
        if (i4 == 0) {
            super.onCreatePanelMenu(i4, menu);
            getMenuInflater();
            Iterator it = ((CopyOnWriteArrayList) this.f9335f.f292f).iterator();
            while (it.hasNext()) {
                ((I) it.next()).f10866a.k();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        if (i4 == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.f9335f.f292f).iterator();
            while (it.hasNext()) {
                if (((I) it.next()).f10866a.p()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z8) {
        if (this.f9348u) {
            return;
        }
        Iterator it = this.f9346s.iterator();
        while (it.hasNext()) {
            ((O.a) it.next()).accept(new E.h(z8));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f9345r.iterator();
        while (it.hasNext()) {
            ((O.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i4, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f9335f.f292f).iterator();
        while (it.hasNext()) {
            ((I) it.next()).f10866a.q();
        }
        super.onPanelClosed(i4, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z8) {
        if (this.f9349v) {
            return;
        }
        Iterator it = this.f9347t.iterator();
        while (it.hasNext()) {
            ((O.a) it.next()).accept(new E.u(z8));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i4, View view, Menu menu) {
        if (i4 == 0) {
            super.onPreparePanel(i4, view, menu);
            Iterator it = ((CopyOnWriteArrayList) this.f9335f.f292f).iterator();
            while (it.hasNext()) {
                ((I) it.next()).f10866a.t();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        if (!this.f9342o.a(i4, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i4, strArr, iArr);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, c.j] */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        j jVar;
        e0 e0Var = this.f9338i;
        if (e0Var == null && (jVar = (j) getLastNonConfigurationInstance()) != null) {
            e0Var = jVar.f9329a;
        }
        if (e0Var == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f9329a = e0Var;
        return obj;
    }

    @Override // E.g, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C0512x c0512x = this.f9336g;
        if (c0512x != null) {
            c0512x.g(EnumC0504o.f8848f);
        }
        super.onSaveInstanceState(bundle);
        this.f9337h.j(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i4) {
        super.onTrimMemory(i4);
        Iterator it = this.f9344q.iterator();
        while (it.hasNext()) {
            ((O.a) it.next()).accept(Integer.valueOf(i4));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (E2.c.e0()) {
                E2.c.I("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            P6.s sVar = this.f9340m;
            synchronized (sVar.f4588c) {
                try {
                    sVar.f4587b = true;
                    Iterator it = ((ArrayList) sVar.f4589d).iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1162a) it.next()).a();
                    }
                    ((ArrayList) sVar.f4589d).clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        l();
        View decorView = getWindow().getDecorView();
        k kVar = this.f9339l;
        if (!kVar.f9332f) {
            kVar.f9332f = true;
            decorView.getViewTreeObserver().addOnDrawListener(kVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z8, Configuration configuration) {
        this.f9348u = true;
        try {
            super.onMultiWindowModeChanged(z8, configuration);
            this.f9348u = false;
            Iterator it = this.f9346s.iterator();
            while (it.hasNext()) {
                O.a aVar = (O.a) it.next();
                o6.j.e(configuration, "newConfig");
                aVar.accept(new E.h(z8));
            }
        } catch (Throwable th) {
            this.f9348u = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z8, Configuration configuration) {
        this.f9349v = true;
        try {
            super.onPictureInPictureModeChanged(z8, configuration);
            this.f9349v = false;
            Iterator it = this.f9347t.iterator();
            while (it.hasNext()) {
                O.a aVar = (O.a) it.next();
                o6.j.e(configuration, "newConfig");
                aVar.accept(new E.u(z8));
            }
        } catch (Throwable th) {
            this.f9349v = false;
            throw th;
        }
    }
}
