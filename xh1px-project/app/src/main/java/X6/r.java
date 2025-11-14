package X6;

import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.T;
import P6.C0279b;
import P6.EnumC0278a;
import T6.F;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import f7.C0724d;
import g0.L;
import i7.AbstractC0890e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import w7.AbstractC1741c;
import w7.AbstractC1754p;
import w7.AbstractC1759v;
import w7.U;
import w7.z;
import x7.AbstractC1825g;
import z7.InterfaceC1887d;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7034a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7035b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7036c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7037d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7038e;

    /* renamed from: f, reason: collision with root package name */
    public Object f7039f;

    public r(int i4) {
        this.f7034a = i4;
        switch (i4) {
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                this.f7037d = new HashMap();
                this.f7038e = new HashSet();
                return;
            default:
                this.f7035b = true;
                this.f7037d = "    ";
                this.f7038e = "type";
                this.f7036c = true;
                this.f7039f = a8.a.f8277e;
                return;
        }
    }

    public static void b(Object obj, ArrayList arrayList, B6.n nVar) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) nVar.m(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                b(it.next(), arrayList, nVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.Collection, java.lang.Iterable] */
    public static i c(T t8) {
        ?? arrayList;
        h hVar;
        boolean z8;
        o6.j.e(t8, "<this>");
        if (t8 instanceof F) {
            List<InterfaceC1887d> upperBounds = t8.getUpperBounds();
            o6.j.d(upperBounds, "getUpperBounds(...)");
            if (!upperBounds.isEmpty()) {
                Iterator it = upperBounds.iterator();
                while (it.hasNext()) {
                    if (!AbstractC1825g.B((InterfaceC1887d) it.next())) {
                        if (!upperBounds.isEmpty()) {
                            Iterator it2 = upperBounds.iterator();
                            while (it2.hasNext()) {
                                if (f((InterfaceC1887d) it2.next()) != null) {
                                    arrayList = upperBounds;
                                    break;
                                }
                            }
                        }
                        if (!upperBounds.isEmpty()) {
                            for (InterfaceC1887d interfaceC1887d : upperBounds) {
                                o6.j.e(interfaceC1887d, "<this>");
                                if (AbstractC1741c.f((AbstractC1759v) interfaceC1887d) != null) {
                                    arrayList = new ArrayList();
                                    for (InterfaceC1887d interfaceC1887d2 : upperBounds) {
                                        o6.j.e(interfaceC1887d2, "<this>");
                                        AbstractC1759v f8 = AbstractC1741c.f((AbstractC1759v) interfaceC1887d2);
                                        if (f8 != null) {
                                            arrayList.add(f8);
                                        }
                                    }
                                    if (!arrayList.isEmpty()) {
                                        Iterator it3 = arrayList.iterator();
                                        while (it3.hasNext()) {
                                            if (!AbstractC1825g.H((InterfaceC1887d) it3.next())) {
                                                hVar = h.f7006f;
                                                break;
                                            }
                                        }
                                    }
                                    hVar = h.f7005e;
                                    if (arrayList != upperBounds) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    return new i(hVar, z8);
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static C0724d e(z zVar) {
        InterfaceC0004e interfaceC0004e;
        y7.i iVar = U.f15977a;
        InterfaceC0007h c6 = zVar.B0().c();
        if (c6 instanceof InterfaceC0004e) {
            interfaceC0004e = (InterfaceC0004e) c6;
        } else {
            interfaceC0004e = null;
        }
        if (interfaceC0004e == null) {
            return null;
        }
        return AbstractC0890e.g(interfaceC0004e);
    }

    public static h f(InterfaceC1887d interfaceC1887d) {
        z h8;
        z h9;
        o6.j.e(interfaceC1887d, "<this>");
        AbstractC1754p g8 = AbstractC1825g.g(interfaceC1887d);
        if (g8 == null || (h8 = AbstractC1825g.N(g8)) == null) {
            h8 = AbstractC1825g.h(interfaceC1887d);
            o6.j.b(h8);
        }
        if (AbstractC1825g.F(h8)) {
            return h.f7005e;
        }
        AbstractC1754p g9 = AbstractC1825g.g(interfaceC1887d);
        if (g9 == null || (h9 = AbstractC1825g.X(g9)) == null) {
            h9 = AbstractC1825g.h(interfaceC1887d);
            o6.j.b(h9);
        }
        if (!AbstractC1825g.F(h9)) {
            return h.f7006f;
        }
        return null;
    }

    public boolean a(x5.g gVar) {
        int id = gVar.getId();
        HashSet hashSet = (HashSet) this.f7038e;
        if (hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        x5.g gVar2 = (x5.g) ((HashMap) this.f7037d).get(Integer.valueOf(g()));
        if (gVar2 != null) {
            j(gVar2, false);
        }
        boolean add = hashSet.add(Integer.valueOf(id));
        if (!gVar.isChecked()) {
            gVar.setChecked(true);
        }
        return add;
    }

    public ArrayList d(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet((HashSet) this.f7038e);
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
            View childAt = viewGroup.getChildAt(i4);
            if ((childAt instanceof x5.g) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int g() {
        HashSet hashSet = (HashSet) this.f7038e;
        if (this.f7035b && !hashSet.isEmpty()) {
            return ((Integer) hashSet.iterator().next()).intValue();
        }
        return -1;
    }

    public void h() {
        L l6 = (L) this.f7039f;
        if (l6 != null) {
            new HashSet((HashSet) this.f7038e);
            ChipGroup chipGroup = (ChipGroup) l6.f10871e;
            q5.i iVar = chipGroup.j;
            if (iVar != null) {
                chipGroup.k.d(chipGroup);
                ChipGroup chipGroup2 = (ChipGroup) ((W5.a) iVar).f6634e;
                if (chipGroup2.k.f7035b) {
                    chipGroup2.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, Z5.g] */
    public ArrayList i(InterfaceC1887d interfaceC1887d) {
        A4.a aVar = (A4.a) this.f7038e;
        P6.t tVar = (P6.t) aVar.f282g.getValue();
        C0279b c0279b = ((S6.a) aVar.f280e).f5412q;
        o6.j.e(interfaceC1887d, "<this>");
        a aVar2 = new a(interfaceC1887d, c0279b.b(tVar, ((AbstractC1759v) interfaceC1887d).getAnnotations()), null);
        B6.n nVar = new B6.n(15, this);
        ArrayList arrayList = new ArrayList(1);
        b(aVar2, arrayList, nVar);
        return arrayList;
    }

    public boolean j(x5.g gVar, boolean z8) {
        int id = gVar.getId();
        HashSet hashSet = (HashSet) this.f7038e;
        if (!hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z8 && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            gVar.setChecked(true);
            return false;
        }
        boolean remove = hashSet.remove(Integer.valueOf(id));
        if (gVar.isChecked()) {
            gVar.setChecked(false);
        }
        return remove;
    }

    public String toString() {
        switch (this.f7034a) {
            case 1:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=false, isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f7035b + ", prettyPrintIndent='" + ((String) this.f7037d) + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.f7038e) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f7036c + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + ((a8.a) this.f7039f) + ')';
            default:
                return super.toString();
        }
    }

    public r(D6.a aVar, boolean z8, A4.a aVar2, EnumC0278a enumC0278a, boolean z9) {
        this.f7034a = 0;
        o6.j.e(aVar2, "containerContext");
        this.f7037d = aVar;
        this.f7035b = z8;
        this.f7038e = aVar2;
        this.f7039f = enumC0278a;
        this.f7036c = z9;
    }
}
