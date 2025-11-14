package c;

import X.O;
import X.S;
import a6.AbstractC0436k;
import a6.C0433h;
import g0.C0744m;
import g0.H;
import g0.Q;
import g0.T;
import g0.f0;
import g0.g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import n6.InterfaceC1163b;
import p0.C1301i;

/* loaded from: classes.dex */
public final class s extends o6.l implements InterfaceC1163b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9355e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f9356f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i4, Object obj) {
        super(1);
        this.f9355e = i4;
        this.f9356f = obj;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f9355e) {
            case 0:
                C0548b c0548b = (C0548b) obj;
                o6.j.e(c0548b, "backEvent");
                C0544A c0544a = (C0544A) this.f9356f;
                C0433h c0433h = c0544a.f9297b;
                ListIterator listIterator = c0433h.listIterator(c0433h.g());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((H) obj2).f10861a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                H h8 = (H) obj2;
                c0544a.f9298c = h8;
                if (h8 != null) {
                    switch (h8.f10864d) {
                        case 0:
                            T t8 = (T) h8.f10865e;
                            if (T.K(3)) {
                                Objects.toString(t8);
                            }
                            t8.x();
                            t8.y(new Q(t8), false);
                            break;
                        default:
                            o6.j.e(c0548b, "backEvent");
                            break;
                    }
                }
                return Z5.y.f7506a;
            case 1:
                C0548b c0548b2 = (C0548b) obj;
                o6.j.e(c0548b2, "backEvent");
                C0544A c0544a2 = (C0544A) this.f9356f;
                H h9 = c0544a2.f9298c;
                if (h9 == null) {
                    C0433h c0433h2 = c0544a2.f9297b;
                    ListIterator listIterator2 = c0433h2.listIterator(c0433h2.g());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((H) obj3).f10861a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    h9 = (H) obj3;
                }
                if (h9 != null) {
                    switch (h9.f10864d) {
                        case 0:
                            T t9 = (T) h9.f10865e;
                            if (T.K(2)) {
                                Objects.toString(t9);
                            }
                            if (t9.f10907h != null) {
                                Iterator it = t9.f(new ArrayList(Collections.singletonList(t9.f10907h)), 0, 1).iterator();
                                while (it.hasNext()) {
                                    C0744m c0744m = (C0744m) it.next();
                                    c0744m.getClass();
                                    o6.j.e(c0548b2, "backEvent");
                                    ArrayList arrayList = c0744m.f11044c;
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        a6.q.f0(arrayList2, ((g0) it2.next()).k);
                                    }
                                    List Q02 = AbstractC0436k.Q0(AbstractC0436k.V0(arrayList2));
                                    int size = Q02.size();
                                    for (int i4 = 0; i4 < size; i4++) {
                                        ((f0) Q02.get(i4)).c(c0548b2, c0744m.f11042a);
                                    }
                                }
                                Iterator it3 = t9.f10912o.iterator();
                                while (it3.hasNext()) {
                                    ((C1301i) it3.next()).getClass();
                                }
                                break;
                            }
                            break;
                        default:
                            o6.j.e(c0548b2, "backEvent");
                            break;
                    }
                }
                return Z5.y.f7506a;
            default:
                Throwable th = (Throwable) obj;
                X.H h10 = (X.H) this.f9356f;
                if (th != null) {
                    h10.k.d(new S(th));
                }
                if (h10.f6662m.f7492e != Z5.v.f7503a) {
                    ((O) h10.f6662m.getValue()).close();
                }
                return Z5.y.f7506a;
        }
    }
}
