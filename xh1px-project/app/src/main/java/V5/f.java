package V5;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import c1.C0560a;
import c1.C0563d;
import com.buzbuz.smartautoclicker.application.SmartAutoClickerApplication;
import g0.AbstractComponentCallbacksC0755y;
import g0.C0731A;
import i.AbstractActivityC0870i;

/* loaded from: classes.dex */
public final class f implements X5.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6434d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6435e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public volatile X5.a f6436f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6437g;

    public f(W0.c cVar) {
        this.f6437g = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Context c(j jVar) {
        j jVar2;
        while ((jVar2 instanceof ContextWrapper) && !(jVar2 instanceof Activity)) {
            jVar2 = jVar2.getBaseContext();
        }
        return jVar2;
    }

    @Override // X5.b
    public final Object a() {
        switch (this.f6434d) {
            case 0:
                if (((c1.h) this.f6436f) == null) {
                    synchronized (this.f6435e) {
                        try {
                            if (((c1.h) this.f6436f) == null) {
                                this.f6436f = new c1.h(new W5.a(0, (SmartAutoClickerApplication) ((W0.c) this.f6437g).f6486e));
                            }
                        } finally {
                        }
                    }
                }
                return (c1.h) this.f6436f;
            default:
                if (((C0563d) this.f6436f) == null) {
                    synchronized (this.f6435e) {
                        try {
                            if (((C0563d) this.f6436f) == null) {
                                this.f6436f = b();
                            }
                        } finally {
                        }
                    }
                }
                return (C0563d) this.f6436f;
        }
    }

    public C0563d b() {
        AbstractActivityC0870i abstractActivityC0870i;
        AbstractActivityC0870i abstractActivityC0870i2;
        AbstractActivityC0870i abstractActivityC0870i3;
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = (AbstractComponentCallbacksC0755y) this.f6437g;
        C0731A c0731a = abstractComponentCallbacksC0755y.f11129y;
        AbstractActivityC0870i abstractActivityC0870i4 = null;
        if (c0731a == null) {
            abstractActivityC0870i = null;
        } else {
            abstractActivityC0870i = c0731a.f10846m;
        }
        if (abstractActivityC0870i != null) {
            if (c0731a == null) {
                abstractActivityC0870i2 = null;
            } else {
                abstractActivityC0870i2 = c0731a.f10846m;
            }
            boolean z8 = abstractActivityC0870i2 instanceof X5.b;
            if (c0731a == null) {
                abstractActivityC0870i3 = null;
            } else {
                abstractActivityC0870i3 = c0731a.f10846m;
            }
            E2.b.h(z8, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", abstractActivityC0870i3.getClass());
            C0731A c0731a2 = abstractComponentCallbacksC0755y.f11129y;
            if (c0731a2 != null) {
                abstractActivityC0870i4 = c0731a2.f10846m;
            }
            C0560a c0560a = (C0560a) ((g) D2.f.p(abstractActivityC0870i4, g.class));
            return new C0563d(c0560a.f9433a, c0560a.f9435c);
        }
        throw new NullPointerException("Hilt Fragments must be attached before creating the component.");
    }

    public f(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
        this.f6437g = abstractComponentCallbacksC0755y;
    }
}
