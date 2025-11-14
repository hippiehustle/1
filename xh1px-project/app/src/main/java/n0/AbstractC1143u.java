package n0;

import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import a6.C0433h;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import com.buzbuz.smartautoclicker.R;
import h4.AbstractC0832f;
import h6.AbstractC0837b;
import i.AbstractC0863b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n6.InterfaceC1163b;
import o.C1207p;
import o0.AbstractC1228a;
import q0.C1351g;
import q4.X;
import u6.AbstractC1638C;

/* renamed from: n0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1143u {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f12811i = 0;

    /* renamed from: d, reason: collision with root package name */
    public final String f12812d;

    /* renamed from: e, reason: collision with root package name */
    public final C1207p f12813e;

    /* renamed from: f, reason: collision with root package name */
    public C1144v f12814f;

    /* renamed from: g, reason: collision with root package name */
    public CharSequence f12815g;

    /* renamed from: h, reason: collision with root package name */
    public final t.k f12816h;

    static {
        new LinkedHashMap();
    }

    public AbstractC1143u(AbstractC1120J abstractC1120J) {
        LinkedHashMap linkedHashMap = C1121K.f12740b;
        this.f12812d = AbstractC0863b.n(abstractC1120J.getClass());
        this.f12813e = new C1207p(this);
        this.f12816h = new t.k(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z8;
        boolean z9;
        if (this != obj) {
            if (obj != null && (obj instanceof AbstractC1143u)) {
                C1207p c1207p = this.f12813e;
                ArrayList arrayList = (ArrayList) c1207p.f13345d;
                AbstractC1143u abstractC1143u = (AbstractC1143u) obj;
                t.k kVar = abstractC1143u.f12816h;
                C1207p c1207p2 = abstractC1143u.f12813e;
                boolean a3 = o6.j.a(arrayList, (ArrayList) c1207p2.f13345d);
                t.k kVar2 = this.f12816h;
                if (kVar2.e() == kVar.e()) {
                    Iterator it = ((H7.a) H7.m.P(new t.l(kVar2))).iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        if (!o6.j.a(kVar2.b(intValue), kVar.b(intValue))) {
                        }
                    }
                    z8 = true;
                    if (j().size() == abstractC1143u.j().size()) {
                        for (Map.Entry entry : (Iterable) AbstractC0436k.k0(j().entrySet()).f2075b) {
                            if (abstractC1143u.j().containsKey(entry.getKey()) && o6.j.a(abstractC1143u.j().get(entry.getKey()), entry.getValue())) {
                            }
                        }
                        z9 = true;
                        if (c1207p.f13342a == c1207p2.f13342a || !o6.j.a((String) c1207p.f13347f, (String) c1207p2.f13347f) || !a3 || !z8 || !z9) {
                        }
                    }
                    z9 = false;
                    if (c1207p.f13342a == c1207p2.f13342a) {
                    }
                }
                z8 = false;
                if (j().size() == abstractC1143u.j().size()) {
                }
                z9 = false;
                if (c1207p.f13342a == c1207p2.f13342a) {
                }
            }
            return false;
        }
        return true;
    }

    public final Bundle g(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f12813e.f13346e;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle k = X.k((Z5.j[]) Arrays.copyOf(new Z5.j[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            C1130h c1130h = (C1130h) entry.getValue();
            c1130h.getClass();
            o6.j.e(str, "name");
            if (c1130h.f12756c && (obj = c1130h.f12757d) != null) {
                c1130h.f12754a.e(k, str, obj);
            }
        }
        if (bundle != null) {
            k.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                C1130h c1130h2 = (C1130h) entry2.getValue();
                c1130h2.getClass();
                AbstractC1117G abstractC1117G = c1130h2.f12754a;
                o6.j.e(str2, "name");
                if (c1130h2.f12755b || !k.containsKey(str2) || !X.B(str2, k)) {
                    try {
                        abstractC1117G.a(str2, k);
                    } catch (IllegalStateException unused) {
                    }
                }
                StringBuilder s8 = A.j.s("Wrong argument type for '", str2, "' in argument savedState. ");
                s8.append(abstractC1117G.b());
                s8.append(" expected.");
                throw new IllegalArgumentException(s8.toString().toString());
            }
        }
        return k;
    }

    public final int[] h(AbstractC1143u abstractC1143u) {
        C1144v c1144v;
        C0433h c0433h = new C0433h();
        AbstractC1143u abstractC1143u2 = this;
        while (true) {
            C1207p c1207p = abstractC1143u2.f12813e;
            C1144v c1144v2 = abstractC1143u2.f12814f;
            if (abstractC1143u != null) {
                c1144v = abstractC1143u.f12814f;
            } else {
                c1144v = null;
            }
            if (c1144v != null) {
                C1144v c1144v3 = abstractC1143u.f12814f;
                o6.j.b(c1144v3);
                if (c1144v3.n(c1207p.f13342a) == abstractC1143u2) {
                    c0433h.addFirst(abstractC1143u2);
                    break;
                }
            }
            if (c1144v2 == null || c1144v2.j.f4113a != c1207p.f13342a) {
                c0433h.addFirst(abstractC1143u2);
            }
            if (o6.j.a(c1144v2, abstractC1143u) || c1144v2 == null) {
                break;
            }
            abstractC1143u2 = c1144v2;
        }
        List Q02 = AbstractC0436k.Q0(c0433h);
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(Q02, 10));
        Iterator it = Q02.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((AbstractC1143u) it.next()).f12813e.f13342a));
        }
        return AbstractC0436k.P0(arrayList);
    }

    public int hashCode() {
        int i4;
        boolean z8;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        C1207p c1207p = this.f12813e;
        int i13 = c1207p.f13342a * 31;
        String str = (String) c1207p.f13347f;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i14 = i13 + i4;
        Iterator it = ((ArrayList) c1207p.f13345d).iterator();
        while (it.hasNext()) {
            C1140r c1140r = (C1140r) it.next();
            int i15 = i14 * 31;
            String str2 = c1140r.f12789a;
            if (str2 != null) {
                i10 = str2.hashCode();
            } else {
                i10 = 0;
            }
            int i16 = (i15 + i10) * 31;
            String str3 = c1140r.f12790b;
            if (str3 != null) {
                i11 = str3.hashCode();
            } else {
                i11 = 0;
            }
            int i17 = (i16 + i11) * 31;
            String str4 = c1140r.f12791c;
            if (str4 != null) {
                i12 = str4.hashCode();
            } else {
                i12 = 0;
            }
            i14 = i17 + i12;
        }
        t.k kVar = this.f12816h;
        o6.j.e(kVar, "<this>");
        int i18 = 0;
        while (true) {
            if (i18 < kVar.e()) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!z8) {
                break;
            }
            int i19 = i18 + 1;
            C1128f c1128f = (C1128f) kVar.f(i18);
            int i20 = ((i14 * 31) + c1128f.f12749a) * 31;
            C1148z c1148z = c1128f.f12750b;
            if (c1148z != null) {
                i9 = c1148z.hashCode();
            } else {
                i9 = 0;
            }
            i14 = i20 + i9;
            Bundle bundle = c1128f.f12751c;
            if (bundle != null) {
                i14 = AbstractC1638C.n(bundle) + (i14 * 31);
            }
            i18 = i19;
        }
        for (String str5 : j().keySet()) {
            int c6 = A.j.c(str5, i14 * 31, 31);
            Object obj = j().get(str5);
            if (obj != null) {
                i8 = obj.hashCode();
            } else {
                i8 = 0;
            }
            i14 = c6 + i8;
        }
        return i14;
    }

    public final C1128f i() {
        C1128f c1128f;
        t.k kVar = this.f12816h;
        if (kVar.e() == 0) {
            c1128f = null;
        } else {
            c1128f = (C1128f) kVar.b(R.id.tutorial_list_to_game);
        }
        if (c1128f == null) {
            C1144v c1144v = this.f12814f;
            if (c1144v == null) {
                return null;
            }
            return c1144v.i();
        }
        return c1128f;
    }

    public final Map j() {
        return a6.x.S0((LinkedHashMap) this.f12813e.f13346e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0380 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x030c  */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.lang.Object, Z5.g] */
    /* JADX WARN: Type inference failed for: r6v28, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1142t k(R.g gVar) {
        boolean z8;
        boolean c6;
        boolean z9;
        Iterator it;
        Z5.n nVar;
        Bundle bundle;
        int i4;
        boolean z10;
        int i8;
        C1142t c1142t;
        I7.k kVar;
        A4.a b4;
        List list;
        List list2;
        ArrayList arrayList;
        int i9;
        Bundle bundle2;
        Bundle bundle3;
        A4.a b9;
        int i10;
        String str;
        boolean equals;
        boolean c9;
        C1207p c1207p = this.f12813e;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c1207p.f13346e;
        String str2 = (String) gVar.f4989g;
        Object obj = (String) gVar.f4988f;
        Uri uri = (Uri) gVar.f4987e;
        ArrayList arrayList2 = (ArrayList) c1207p.f13345d;
        if (arrayList2.isEmpty()) {
            return null;
        }
        Iterator it2 = arrayList2.iterator();
        C1142t c1142t2 = null;
        while (it2.hasNext()) {
            C1140r c1140r = (C1140r) it2.next();
            c1140r.getClass();
            Z5.n nVar2 = c1140r.f12801o;
            Z5.n nVar3 = c1140r.f12794f;
            String str3 = c1140r.f12791c;
            String str4 = c1140r.f12790b;
            if (((I7.k) nVar3.getValue()) == null) {
                c6 = true;
            } else if (uri == null) {
                c6 = false;
            } else {
                I7.k kVar2 = (I7.k) nVar3.getValue();
                o6.j.b(kVar2);
                z8 = true;
                c6 = kVar2.c(uri.toString());
                if (c6) {
                    if (str4 == null) {
                        equals = z8;
                    } else if (obj == null) {
                        equals = false;
                    } else {
                        equals = str4.equals(obj);
                    }
                    if (equals) {
                        if (str3 == null) {
                            c9 = z8;
                        } else if (str2 == null) {
                            c9 = false;
                        } else {
                            I7.k kVar3 = (I7.k) nVar2.getValue();
                            o6.j.b(kVar3);
                            c9 = kVar3.c(str2);
                        }
                        if (c9) {
                            z9 = z8;
                            if (z9) {
                                if (uri != null) {
                                    c1140r.getClass();
                                    o6.j.e(uri, "deepLink");
                                    o6.j.e(linkedHashMap, "arguments");
                                    I7.k kVar4 = (I7.k) c1140r.f12794f.getValue();
                                    if (kVar4 != null) {
                                        bundle2 = null;
                                        A4.a b10 = kVar4.b(uri.toString());
                                        if (b10 != null) {
                                            final Bundle k = X.k((Z5.j[]) Arrays.copyOf(new Z5.j[0], 0));
                                            if (c1140r.c(b10, k, linkedHashMap) && (!((Boolean) c1140r.f12795g.getValue()).booleanValue() || c1140r.d(uri, k, linkedHashMap))) {
                                                String fragment = uri.getFragment();
                                                I7.k kVar5 = (I7.k) c1140r.f12799m.getValue();
                                                if (kVar5 == null || (b9 = kVar5.b(String.valueOf(fragment))) == null) {
                                                    it = it2;
                                                } else {
                                                    List list3 = (List) c1140r.k.getValue();
                                                    it = it2;
                                                    ArrayList arrayList3 = new ArrayList(AbstractC0438m.d0(list3, 10));
                                                    Iterator it3 = list3.iterator();
                                                    int i11 = 0;
                                                    while (it3.hasNext()) {
                                                        Object next = it3.next();
                                                        Iterator it4 = it3;
                                                        int i12 = i11 + 1;
                                                        if (i11 >= 0) {
                                                            String str5 = (String) next;
                                                            nVar = nVar2;
                                                            I7.h h8 = ((I7.j) b9.f282g).h(i12);
                                                            if (h8 != null) {
                                                                str = Uri.decode(h8.f2239a);
                                                                i10 = i12;
                                                                o6.j.d(str, "decode(...)");
                                                            } else {
                                                                i10 = i12;
                                                                str = null;
                                                            }
                                                            if (str == null) {
                                                                str = "";
                                                            }
                                                            try {
                                                                C1140r.e(k, str5, str, (C1130h) linkedHashMap.get(str5));
                                                                arrayList3.add(Z5.y.f7506a);
                                                                nVar2 = nVar;
                                                                it3 = it4;
                                                                i11 = i10;
                                                            } catch (IllegalArgumentException unused) {
                                                            }
                                                        } else {
                                                            AbstractC0437l.c0();
                                                            throw null;
                                                        }
                                                    }
                                                }
                                                nVar = nVar2;
                                                final int i13 = 0;
                                                if (AbstractC0832f.u(linkedHashMap, new InterfaceC1163b() { // from class: n0.p
                                                    @Override // n6.InterfaceC1163b
                                                    public final Object m(Object obj2) {
                                                        boolean containsKey;
                                                        String str6 = (String) obj2;
                                                        switch (i13) {
                                                            case 0:
                                                                o6.j.e(str6, "argName");
                                                                Bundle bundle4 = k;
                                                                o6.j.e(bundle4, "source");
                                                                containsKey = bundle4.containsKey(str6);
                                                                break;
                                                            default:
                                                                o6.j.e(str6, "key");
                                                                Bundle bundle5 = k;
                                                                o6.j.e(bundle5, "source");
                                                                containsKey = bundle5.containsKey(str6);
                                                                break;
                                                        }
                                                        return Boolean.valueOf(!containsKey);
                                                    }
                                                }).isEmpty()) {
                                                    bundle3 = k;
                                                    bundle = bundle3;
                                                }
                                            }
                                        }
                                        it = it2;
                                        nVar = nVar2;
                                    } else {
                                        it = it2;
                                        nVar = nVar2;
                                        bundle2 = null;
                                    }
                                    bundle3 = bundle2;
                                    bundle = bundle3;
                                } else {
                                    it = it2;
                                    nVar = nVar2;
                                    bundle = null;
                                }
                                String str6 = c1140r.f12789a;
                                if (uri != null && str6 != null) {
                                    List<String> pathSegments = uri.getPathSegments();
                                    Uri parse = Uri.parse(str6);
                                    o6.j.d(parse, "parse(...)");
                                    List<String> pathSegments2 = parse.getPathSegments();
                                    o6.j.e(pathSegments, "<this>");
                                    o6.j.e(pathSegments2, "other");
                                    Set U02 = AbstractC0436k.U0(pathSegments);
                                    U02.retainAll(pathSegments2);
                                    i4 = U02.size();
                                } else {
                                    i4 = 0;
                                }
                                int i14 = i4;
                                if (obj != null && obj.equals(str4)) {
                                    z10 = z8;
                                } else {
                                    z10 = false;
                                }
                                if (str2 != null && str3 != null) {
                                    I7.k kVar6 = (I7.k) nVar.getValue();
                                    o6.j.b(kVar6);
                                    if (kVar6.c(str2)) {
                                        Pattern compile = Pattern.compile("/");
                                        o6.j.d(compile, "compile(...)");
                                        Matcher matcher = compile.matcher(str3);
                                        if (!matcher.find()) {
                                            list = E2.d.y(str3.toString());
                                        } else {
                                            ArrayList arrayList4 = new ArrayList(10);
                                            int i15 = 0;
                                            do {
                                                arrayList4.add(str3.subSequence(i15, matcher.start()).toString());
                                                i15 = matcher.end();
                                            } while (matcher.find());
                                            arrayList4.add(str3.subSequence(i15, str3.length()).toString());
                                            list = arrayList4;
                                        }
                                        boolean isEmpty = list.isEmpty();
                                        List list4 = a6.s.f7766d;
                                        if (!isEmpty) {
                                            ListIterator listIterator = list.listIterator(list.size());
                                            while (listIterator.hasPrevious()) {
                                                if (((String) listIterator.previous()).length() != 0) {
                                                    list2 = AbstractC0436k.M0(listIterator.nextIndex() + 1, list);
                                                    break;
                                                }
                                            }
                                        }
                                        list2 = list4;
                                        String str7 = (String) list2.get(0);
                                        String str8 = (String) list2.get(z8 ? 1 : 0);
                                        Pattern compile2 = Pattern.compile("/");
                                        o6.j.d(compile2, "compile(...)");
                                        Matcher matcher2 = compile2.matcher(str2);
                                        if (!matcher2.find()) {
                                            arrayList = E2.d.y(str2.toString());
                                        } else {
                                            ArrayList arrayList5 = new ArrayList(10);
                                            int i16 = 0;
                                            do {
                                                arrayList5.add(str2.subSequence(i16, matcher2.start()).toString());
                                                i16 = matcher2.end();
                                            } while (matcher2.find());
                                            arrayList5.add(str2.subSequence(i16, str2.length()).toString());
                                            arrayList = arrayList5;
                                        }
                                        if (!arrayList.isEmpty()) {
                                            ListIterator listIterator2 = arrayList.listIterator(arrayList.size());
                                            while (listIterator2.hasPrevious()) {
                                                if (((String) listIterator2.previous()).length() != 0) {
                                                    i9 = 1;
                                                    list4 = AbstractC0436k.M0(listIterator2.nextIndex() + 1, arrayList);
                                                    break;
                                                }
                                            }
                                        }
                                        i9 = 1;
                                        List list5 = list4;
                                        String str9 = (String) list5.get(0);
                                        String str10 = (String) list5.get(i9);
                                        if (o6.j.a(str7, str9)) {
                                            i8 = 2;
                                        } else {
                                            i8 = 0;
                                        }
                                        if (o6.j.a(str8, str10)) {
                                            i8++;
                                        }
                                        if (bundle == null) {
                                            if (z10 || i8 > -1) {
                                                o6.j.e(linkedHashMap, "arguments");
                                                final Bundle k6 = X.k((Z5.j[]) Arrays.copyOf(new Z5.j[0], 0));
                                                if (uri != null && (kVar = (I7.k) nVar3.getValue()) != null && (b4 = kVar.b(uri.toString())) != null) {
                                                    c1140r.c(b4, k6, linkedHashMap);
                                                    if (((Boolean) c1140r.f12795g.getValue()).booleanValue()) {
                                                        c1140r.d(uri, k6, linkedHashMap);
                                                    }
                                                }
                                                final int i17 = 1;
                                                if (!AbstractC0832f.u(linkedHashMap, new InterfaceC1163b() { // from class: n0.p
                                                    @Override // n6.InterfaceC1163b
                                                    public final Object m(Object obj2) {
                                                        boolean containsKey;
                                                        String str62 = (String) obj2;
                                                        switch (i17) {
                                                            case 0:
                                                                o6.j.e(str62, "argName");
                                                                Bundle bundle4 = k6;
                                                                o6.j.e(bundle4, "source");
                                                                containsKey = bundle4.containsKey(str62);
                                                                break;
                                                            default:
                                                                o6.j.e(str62, "key");
                                                                Bundle bundle5 = k6;
                                                                o6.j.e(bundle5, "source");
                                                                containsKey = bundle5.containsKey(str62);
                                                                break;
                                                        }
                                                        return Boolean.valueOf(!containsKey);
                                                    }
                                                }).isEmpty()) {
                                                }
                                            }
                                        }
                                        c1142t = new C1142t((AbstractC1143u) c1207p.f13343b, bundle, c1140r.f12802p, i14, z10, i8);
                                        if (c1142t2 != null || c1142t.compareTo(c1142t2) > 0) {
                                            c1142t2 = c1142t;
                                            it2 = it;
                                        }
                                    }
                                }
                                i8 = -1;
                                if (bundle == null) {
                                }
                                c1142t = new C1142t((AbstractC1143u) c1207p.f13343b, bundle, c1140r.f12802p, i14, z10, i8);
                                if (c1142t2 != null) {
                                }
                                c1142t2 = c1142t;
                                it2 = it;
                            } else {
                                it = it2;
                            }
                            it2 = it;
                        }
                    }
                }
                z9 = false;
                if (z9) {
                }
                it2 = it;
            }
            z8 = true;
            if (c6) {
            }
            z9 = false;
            if (z9) {
            }
            it2 = it;
        }
        return c1142t2;
    }

    public void l(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC1228a.f13435e);
        o6.j.d(obtainAttributes, "obtainAttributes(...)");
        String string = obtainAttributes.getString(2);
        C1207p c1207p = this.f12813e;
        if (string == null) {
            c1207p.f13342a = 0;
            c1207p.f13344c = null;
        } else {
            c1207p.getClass();
            if (!I7.m.j0(string)) {
                String concat = "android-app://androidx.navigation/".concat(string);
                o6.j.e(concat, "uriPattern");
                ArrayList u8 = AbstractC0832f.u((LinkedHashMap) c1207p.f13346e, new C1351g(new C1140r(concat, null, null), 1));
                if (u8.isEmpty()) {
                    new Z5.n(new B0.e(26, concat));
                    c1207p.f13342a = concat.hashCode();
                    c1207p.f13344c = null;
                } else {
                    StringBuilder s8 = A.j.s("Cannot set route \"", string, "\" for destination ");
                    s8.append((AbstractC1143u) c1207p.f13343b);
                    s8.append(". Following required arguments are missing: ");
                    s8.append(u8);
                    throw new IllegalArgumentException(s8.toString().toString());
                }
            } else {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
        }
        c1207p.f13347f = string;
        if (obtainAttributes.hasValue(1)) {
            int resourceId = obtainAttributes.getResourceId(1, 0);
            c1207p.f13342a = resourceId;
            c1207p.f13344c = null;
            c1207p.f13344c = AbstractC0837b.j(new c0.o(context, 1), resourceId);
        }
        this.f12815g = obtainAttributes.getText(0);
        obtainAttributes.recycle();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        C1207p c1207p = this.f12813e;
        String str = (String) c1207p.f13344c;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(c1207p.f13342a));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = (String) c1207p.f13347f;
        if (str2 != null && !I7.m.j0(str2)) {
            sb.append(" route=");
            sb.append((String) c1207p.f13347f);
        }
        if (this.f12815g != null) {
            sb.append(" label=");
            sb.append(this.f12815g);
        }
        String sb2 = sb.toString();
        o6.j.d(sb2, "toString(...)");
        return sb2;
    }
}
