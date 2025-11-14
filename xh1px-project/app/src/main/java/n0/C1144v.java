package n0;

import O7.Y;
import P.S;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.Iterator;
import o.C1207p;
import o0.AbstractC1228a;
import p6.InterfaceC1315a;
import q0.C1352h;

/* renamed from: n0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1144v extends AbstractC1143u implements Iterable, InterfaceC1315a {
    public static final /* synthetic */ int k = 0;
    public final Y j;

    /* JADX WARN: Type inference failed for: r3v1, types: [O7.Y, java.lang.Object] */
    public C1144v(C1145w c1145w) {
        super(c1145w);
        ?? obj = new Object();
        obj.f4114b = this;
        obj.f4115c = new t.k(0);
        this.j = obj;
    }

    @Override // n0.AbstractC1143u
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C1144v) && super.equals(obj)) {
                Y y4 = this.j;
                int e9 = ((t.k) y4.f4115c).e();
                Y y5 = ((C1144v) obj).j;
                if (e9 == ((t.k) y5.f4115c).e() && y4.f4113a == y5.f4113a) {
                    t.k kVar = (t.k) y4.f4115c;
                    o6.j.e(kVar, "<this>");
                    Iterator it = ((H7.a) H7.m.P(new S(8, kVar))).iterator();
                    while (it.hasNext()) {
                        AbstractC1143u abstractC1143u = (AbstractC1143u) it.next();
                        if (!abstractC1143u.equals(((t.k) y5.f4115c).b(abstractC1143u.f12813e.f13342a))) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // n0.AbstractC1143u
    public final int hashCode() {
        Y y4 = this.j;
        int i4 = y4.f4113a;
        t.k kVar = (t.k) y4.f4115c;
        int e9 = kVar.e();
        for (int i8 = 0; i8 < e9; i8++) {
            i4 = (((i4 * 31) + kVar.c(i8)) * 31) + ((AbstractC1143u) kVar.f(i8)).hashCode();
        }
        return i4;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Y y4 = this.j;
        y4.getClass();
        return new C1352h(y4);
    }

    @Override // n0.AbstractC1143u
    public final C1142t k(R.g gVar) {
        C1142t k6 = super.k(gVar);
        Y y4 = this.j;
        y4.getClass();
        return y4.e(k6, gVar, false, (C1144v) y4.f4114b);
    }

    @Override // n0.AbstractC1143u
    public final void l(Context context, AttributeSet attributeSet) {
        String valueOf;
        super.l(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC1228a.f13434d);
        o6.j.d(obtainAttributes, "obtainAttributes(...)");
        int resourceId = obtainAttributes.getResourceId(0, 0);
        Y y4 = this.j;
        C1144v c1144v = (C1144v) y4.f4114b;
        if (resourceId != c1144v.f12813e.f13342a) {
            y4.f4113a = resourceId;
            y4.f4116d = null;
            if (resourceId <= 16777215) {
                valueOf = String.valueOf(resourceId);
            } else {
                try {
                    valueOf = context.getResources().getResourceName(resourceId);
                    o6.j.b(valueOf);
                } catch (Resources.NotFoundException unused) {
                    valueOf = String.valueOf(resourceId);
                }
            }
            y4.f4116d = valueOf;
            obtainAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException(("Start destination " + resourceId + " cannot use the same id as the graph " + c1144v).toString());
    }

    public final void m(AbstractC1143u abstractC1143u) {
        o6.j.e(abstractC1143u, "node");
        Y y4 = this.j;
        t.k kVar = (t.k) y4.f4115c;
        C1144v c1144v = (C1144v) y4.f4114b;
        C1207p c1207p = abstractC1143u.f12813e;
        int i4 = c1207p.f13342a;
        String str = (String) c1207p.f13347f;
        if (i4 == 0 && str == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        String str2 = (String) c1144v.f12813e.f13347f;
        if (str2 != null && o6.j.a(str, str2)) {
            throw new IllegalArgumentException(("Destination " + abstractC1143u + " cannot have the same route as graph " + c1144v).toString());
        }
        if (i4 != c1144v.f12813e.f13342a) {
            AbstractC1143u abstractC1143u2 = (AbstractC1143u) kVar.b(i4);
            if (abstractC1143u2 == abstractC1143u) {
                return;
            }
            if (abstractC1143u.f12814f == null) {
                if (abstractC1143u2 != null) {
                    abstractC1143u2.f12814f = null;
                }
                abstractC1143u.f12814f = c1144v;
                kVar.d(c1207p.f13342a, abstractC1143u);
                return;
            }
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        throw new IllegalArgumentException(("Destination " + abstractC1143u + " cannot have the same id as graph " + c1144v).toString());
    }

    public final AbstractC1143u n(int i4) {
        Y y4 = this.j;
        return y4.b(i4, (C1144v) y4.f4114b, null, false);
    }

    public final C1142t o(R.g gVar, AbstractC1143u abstractC1143u) {
        return this.j.e(super.k(gVar), gVar, true, abstractC1143u);
    }

    @Override // n0.AbstractC1143u
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Y y4 = this.j;
        y4.getClass();
        y4.getClass();
        AbstractC1143u n3 = n(y4.f4113a);
        sb.append(" startDestination=");
        if (n3 == null) {
            String str = (String) y4.f4116d;
            if (str != null) {
                sb.append(str);
            } else {
                sb.append("0x" + Integer.toHexString(y4.f4113a));
            }
        } else {
            sb.append("{");
            sb.append(n3.toString());
            sb.append("}");
        }
        String sb2 = sb.toString();
        o6.j.d(sb2, "toString(...)");
        return sb2;
    }
}
