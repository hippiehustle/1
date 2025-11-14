package androidx.lifecycle;

import O7.i0;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p.C1290b;
import q.C1339a;
import q.C1340b;
import q.C1341c;
import q.C1342d;

/* renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0512x {

    /* renamed from: a, reason: collision with root package name */
    public d0 f8859a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8860b;

    /* renamed from: c, reason: collision with root package name */
    public C1339a f8861c;

    /* renamed from: d, reason: collision with root package name */
    public EnumC0504o f8862d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f8863e;

    /* renamed from: f, reason: collision with root package name */
    public int f8864f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8865g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8866h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f8867i;
    public final i0 j;

    public C0512x(InterfaceC0510v interfaceC0510v) {
        o6.j.e(interfaceC0510v, "provider");
        this.f8859a = new d0();
        this.f8860b = true;
        this.f8861c = new C1339a();
        EnumC0504o enumC0504o = EnumC0504o.f8847e;
        this.f8862d = enumC0504o;
        this.f8867i = new ArrayList();
        this.f8863e = new WeakReference(interfaceC0510v);
        this.j = O7.V.c(enumC0504o);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.w, java.lang.Object] */
    public final void a(InterfaceC0509u interfaceC0509u) {
        InterfaceC0508t c0496g;
        Object obj;
        InterfaceC0510v interfaceC0510v;
        EnumC0503n enumC0503n;
        o6.j.e(interfaceC0509u, "observer");
        c("addObserver");
        EnumC0504o enumC0504o = this.f8862d;
        EnumC0504o enumC0504o2 = EnumC0504o.f8846d;
        if (enumC0504o != enumC0504o2) {
            enumC0504o2 = EnumC0504o.f8847e;
        }
        ?? obj2 = new Object();
        HashMap hashMap = AbstractC0513y.f8868a;
        boolean z8 = interfaceC0509u instanceof InterfaceC0508t;
        boolean z9 = interfaceC0509u instanceof c0.l;
        int i4 = 0;
        if (z8 && z9) {
            c0496g = new C0496g((c0.l) interfaceC0509u, (InterfaceC0508t) interfaceC0509u);
        } else if (z9) {
            c0496g = new C0496g((c0.l) interfaceC0509u, (InterfaceC0508t) null);
        } else if (z8) {
            c0496g = (InterfaceC0508t) interfaceC0509u;
        } else {
            Class<?> cls = interfaceC0509u.getClass();
            if (AbstractC0513y.b(cls) == 2) {
                Object obj3 = AbstractC0513y.f8869b.get(cls);
                o6.j.b(obj3);
                List list = (List) obj3;
                if (list.size() != 1) {
                    int size = list.size();
                    InterfaceC0498i[] interfaceC0498iArr = new InterfaceC0498i[size];
                    if (size <= 0) {
                        c0496g = new C0494e(i4, interfaceC0498iArr);
                    } else {
                        AbstractC0513y.a((Constructor) list.get(0), interfaceC0509u);
                        throw null;
                    }
                } else {
                    AbstractC0513y.a((Constructor) list.get(0), interfaceC0509u);
                    throw null;
                }
            } else {
                c0496g = new C0496g(interfaceC0509u);
            }
        }
        obj2.f8858b = c0496g;
        obj2.f8857a = enumC0504o2;
        C1339a c1339a = this.f8861c;
        C1341c g8 = c1339a.g(interfaceC0509u);
        if (g8 != null) {
            obj = g8.f13860e;
        } else {
            HashMap hashMap2 = c1339a.f13855h;
            C1341c c1341c = new C1341c(interfaceC0509u, obj2);
            c1339a.f13869g++;
            C1341c c1341c2 = c1339a.f13867e;
            if (c1341c2 == null) {
                c1339a.f13866d = c1341c;
                c1339a.f13867e = c1341c;
            } else {
                c1341c2.f13861f = c1341c;
                c1341c.f13862g = c1341c2;
                c1339a.f13867e = c1341c;
            }
            hashMap2.put(interfaceC0509u, c1341c);
            obj = null;
        }
        if (((C0511w) obj) != null || (interfaceC0510v = (InterfaceC0510v) this.f8863e.get()) == null) {
            return;
        }
        if (this.f8864f != 0 || this.f8865g) {
            i4 = 1;
        }
        EnumC0504o b4 = b(interfaceC0509u);
        this.f8864f++;
        while (obj2.f8857a.compareTo(b4) < 0 && this.f8861c.f13855h.containsKey(interfaceC0509u)) {
            EnumC0504o enumC0504o3 = obj2.f8857a;
            ArrayList arrayList = this.f8867i;
            arrayList.add(enumC0504o3);
            C0501l c0501l = EnumC0503n.Companion;
            EnumC0504o enumC0504o4 = obj2.f8857a;
            c0501l.getClass();
            o6.j.e(enumC0504o4, "state");
            int ordinal = enumC0504o4.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        enumC0503n = null;
                    } else {
                        enumC0503n = EnumC0503n.ON_RESUME;
                    }
                } else {
                    enumC0503n = EnumC0503n.ON_START;
                }
            } else {
                enumC0503n = EnumC0503n.ON_CREATE;
            }
            if (enumC0503n != null) {
                obj2.a(interfaceC0510v, enumC0503n);
                arrayList.remove(arrayList.size() - 1);
                b4 = b(interfaceC0509u);
            } else {
                throw new IllegalStateException("no event up from " + obj2.f8857a);
            }
        }
        if (i4 == 0) {
            h();
        }
        this.f8864f--;
    }

    public final EnumC0504o b(InterfaceC0509u interfaceC0509u) {
        C1341c c1341c;
        EnumC0504o enumC0504o;
        HashMap hashMap = this.f8861c.f13855h;
        EnumC0504o enumC0504o2 = null;
        if (hashMap.containsKey(interfaceC0509u)) {
            c1341c = ((C1341c) hashMap.get(interfaceC0509u)).f13862g;
        } else {
            c1341c = null;
        }
        if (c1341c != null) {
            enumC0504o = ((C0511w) c1341c.f13860e).f8857a;
        } else {
            enumC0504o = null;
        }
        ArrayList arrayList = this.f8867i;
        if (!arrayList.isEmpty()) {
            enumC0504o2 = (EnumC0504o) arrayList.get(arrayList.size() - 1);
        }
        EnumC0504o enumC0504o3 = this.f8862d;
        o6.j.e(enumC0504o3, "state1");
        if (enumC0504o == null || enumC0504o.compareTo(enumC0504o3) >= 0) {
            enumC0504o = enumC0504o3;
        }
        if (enumC0504o2 != null && enumC0504o2.compareTo(enumC0504o) < 0) {
            return enumC0504o2;
        }
        return enumC0504o;
    }

    public final void c(String str) {
        if (this.f8860b) {
            C1290b.u().f13647a.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            } else {
                throw new IllegalStateException(A.j.p("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(EnumC0503n enumC0503n) {
        o6.j.e(enumC0503n, "event");
        c("handleLifecycleEvent");
        e(enumC0503n.a());
    }

    public final void e(EnumC0504o enumC0504o) {
        if (this.f8862d != enumC0504o) {
            InterfaceC0510v interfaceC0510v = (InterfaceC0510v) this.f8863e.get();
            EnumC0504o enumC0504o2 = this.f8862d;
            o6.j.e(enumC0504o2, "current");
            o6.j.e(enumC0504o, "next");
            EnumC0504o enumC0504o3 = EnumC0504o.f8847e;
            EnumC0504o enumC0504o4 = EnumC0504o.f8846d;
            if (enumC0504o2 == enumC0504o3 && enumC0504o == enumC0504o4) {
                throw new IllegalStateException(("State must be at least '" + EnumC0504o.f8848f + "' to be moved to '" + enumC0504o + "' in component " + interfaceC0510v).toString());
            }
            if (enumC0504o2 == enumC0504o4 && enumC0504o2 != enumC0504o) {
                throw new IllegalStateException(("State is '" + enumC0504o4 + "' and cannot be moved to `" + enumC0504o + "` in component " + interfaceC0510v).toString());
            }
            this.f8862d = enumC0504o;
            if (!this.f8865g && this.f8864f == 0) {
                this.f8865g = true;
                h();
                this.f8865g = false;
                if (this.f8862d == enumC0504o4) {
                    this.f8861c = new C1339a();
                    return;
                }
                return;
            }
            this.f8866h = true;
        }
    }

    public final void f(InterfaceC0509u interfaceC0509u) {
        o6.j.e(interfaceC0509u, "observer");
        c("removeObserver");
        this.f8861c.h(interfaceC0509u);
    }

    public final void g(EnumC0504o enumC0504o) {
        o6.j.e(enumC0504o, "state");
        c("setCurrentState");
        e(enumC0504o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r12.f8866h = false;
        r12.j.g(r12.f8862d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        EnumC0503n enumC0503n;
        EnumC0503n enumC0503n2;
        InterfaceC0510v interfaceC0510v = (InterfaceC0510v) this.f8863e.get();
        if (interfaceC0510v == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C1339a c1339a = this.f8861c;
            if (c1339a.f13869g != 0) {
                C1341c c1341c = c1339a.f13866d;
                o6.j.b(c1341c);
                EnumC0504o enumC0504o = ((C0511w) c1341c.f13860e).f8857a;
                C1341c c1341c2 = this.f8861c.f13867e;
                o6.j.b(c1341c2);
                EnumC0504o enumC0504o2 = ((C0511w) c1341c2.f13860e).f8857a;
                if (enumC0504o == enumC0504o2 && this.f8862d == enumC0504o2) {
                    break;
                }
                this.f8866h = false;
                EnumC0504o enumC0504o3 = this.f8862d;
                C1341c c1341c3 = this.f8861c.f13866d;
                o6.j.b(c1341c3);
                if (enumC0504o3.compareTo(((C0511w) c1341c3.f13860e).f8857a) < 0) {
                    C1339a c1339a2 = this.f8861c;
                    C1340b c1340b = new C1340b(c1339a2.f13867e, c1339a2.f13866d, 1);
                    c1339a2.f13868f.put(c1340b, Boolean.FALSE);
                    while (c1340b.hasNext() && !this.f8866h) {
                        Map.Entry entry = (Map.Entry) c1340b.next();
                        o6.j.b(entry);
                        InterfaceC0509u interfaceC0509u = (InterfaceC0509u) entry.getKey();
                        C0511w c0511w = (C0511w) entry.getValue();
                        while (c0511w.f8857a.compareTo(this.f8862d) > 0 && !this.f8866h && this.f8861c.f13855h.containsKey(interfaceC0509u)) {
                            C0501l c0501l = EnumC0503n.Companion;
                            EnumC0504o enumC0504o4 = c0511w.f8857a;
                            c0501l.getClass();
                            o6.j.e(enumC0504o4, "state");
                            int ordinal = enumC0504o4.ordinal();
                            if (ordinal != 2) {
                                if (ordinal != 3) {
                                    if (ordinal != 4) {
                                        enumC0503n2 = null;
                                    } else {
                                        enumC0503n2 = EnumC0503n.ON_PAUSE;
                                    }
                                } else {
                                    enumC0503n2 = EnumC0503n.ON_STOP;
                                }
                            } else {
                                enumC0503n2 = EnumC0503n.ON_DESTROY;
                            }
                            if (enumC0503n2 != null) {
                                this.f8867i.add(enumC0503n2.a());
                                c0511w.a(interfaceC0510v, enumC0503n2);
                                ArrayList arrayList = this.f8867i;
                                arrayList.remove(arrayList.size() - 1);
                            } else {
                                throw new IllegalStateException("no event down from " + c0511w.f8857a);
                            }
                        }
                    }
                }
                C1341c c1341c4 = this.f8861c.f13867e;
                if (!this.f8866h && c1341c4 != null && this.f8862d.compareTo(((C0511w) c1341c4.f13860e).f8857a) > 0) {
                    C1339a c1339a3 = this.f8861c;
                    c1339a3.getClass();
                    C1342d c1342d = new C1342d(c1339a3);
                    c1339a3.f13868f.put(c1342d, Boolean.FALSE);
                    while (c1342d.hasNext() && !this.f8866h) {
                        Map.Entry entry2 = (Map.Entry) c1342d.next();
                        InterfaceC0509u interfaceC0509u2 = (InterfaceC0509u) entry2.getKey();
                        C0511w c0511w2 = (C0511w) entry2.getValue();
                        while (c0511w2.f8857a.compareTo(this.f8862d) < 0 && !this.f8866h && this.f8861c.f13855h.containsKey(interfaceC0509u2)) {
                            this.f8867i.add(c0511w2.f8857a);
                            C0501l c0501l2 = EnumC0503n.Companion;
                            EnumC0504o enumC0504o5 = c0511w2.f8857a;
                            c0501l2.getClass();
                            o6.j.e(enumC0504o5, "state");
                            int ordinal2 = enumC0504o5.ordinal();
                            if (ordinal2 != 1) {
                                if (ordinal2 != 2) {
                                    if (ordinal2 != 3) {
                                        enumC0503n = null;
                                    } else {
                                        enumC0503n = EnumC0503n.ON_RESUME;
                                    }
                                } else {
                                    enumC0503n = EnumC0503n.ON_START;
                                }
                            } else {
                                enumC0503n = EnumC0503n.ON_CREATE;
                            }
                            if (enumC0503n != null) {
                                c0511w2.a(interfaceC0510v, enumC0503n);
                                ArrayList arrayList2 = this.f8867i;
                                arrayList2.remove(arrayList2.size() - 1);
                            } else {
                                throw new IllegalStateException("no event up from " + c0511w2.f8857a);
                            }
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
