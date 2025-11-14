package n0;

import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n6.InterfaceC1162a;
import q4.X;

/* renamed from: n0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1140r {

    /* renamed from: q, reason: collision with root package name */
    public static final I7.k f12783q = new I7.k("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: r, reason: collision with root package name */
    public static final I7.k f12784r = new I7.k("\\{(.+?)\\}");

    /* renamed from: s, reason: collision with root package name */
    public static final I7.k f12785s = new I7.k("http[s]?://");

    /* renamed from: t, reason: collision with root package name */
    public static final I7.k f12786t = new I7.k(".*");

    /* renamed from: u, reason: collision with root package name */
    public static final I7.k f12787u = new I7.k("([^/]*?|)");

    /* renamed from: v, reason: collision with root package name */
    public static final I7.k f12788v = new I7.k("^[^?#]+\\?([^#]*).*");

    /* renamed from: a, reason: collision with root package name */
    public final String f12789a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12790b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12791c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f12792d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12793e;

    /* renamed from: f, reason: collision with root package name */
    public final Z5.n f12794f;

    /* renamed from: g, reason: collision with root package name */
    public final Z5.n f12795g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f12796h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f12797i;
    public final Object j;
    public final Object k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f12798l;

    /* renamed from: m, reason: collision with root package name */
    public final Z5.n f12799m;

    /* renamed from: n, reason: collision with root package name */
    public final String f12800n;

    /* renamed from: o, reason: collision with root package name */
    public final Z5.n f12801o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f12802p;

    public C1140r(String str, String str2, String str3) {
        List list;
        List list2;
        boolean z8;
        this.f12789a = str;
        this.f12790b = str2;
        this.f12791c = str3;
        ArrayList arrayList = new ArrayList();
        this.f12792d = arrayList;
        final int i4 = 0;
        this.f12794f = new Z5.n(new InterfaceC1162a(this) { // from class: n0.o

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C1140r f12778e;

            {
                this.f12778e = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, Z5.g] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, Z5.g] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, Z5.g] */
            @Override // n6.InterfaceC1162a
            public final Object a() {
                boolean z9;
                List list3;
                switch (i4) {
                    case 0:
                        String str4 = this.f12778e.f12793e;
                        if (str4 != null) {
                            return new I7.k(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = this.f12778e.f12789a;
                        if (str5 != null && C1140r.f12788v.c(str5)) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        return Boolean.valueOf(z9);
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        C1140r c1140r = this.f12778e;
                        String str6 = c1140r.f12789a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) c1140r.f12795g.getValue()).booleanValue()) {
                            o6.j.b(str6);
                            Uri parse = Uri.parse(str6);
                            o6.j.d(parse, "parse(...)");
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                int i8 = 1;
                                if (queryParameters.size() <= 1) {
                                    String str8 = (String) AbstractC0436k.r0(queryParameters);
                                    if (str8 == null) {
                                        c1140r.f12797i = true;
                                        str8 = str7;
                                    }
                                    A4.a a3 = I7.k.a(C1140r.f12784r, str8);
                                    C1139q c1139q = new C1139q();
                                    int i9 = 0;
                                    while (a3 != null) {
                                        I7.h h8 = ((I7.j) a3.f282g).h(i8);
                                        o6.j.b(h8);
                                        int i10 = i8;
                                        c1139q.f12782b.add(h8.f2239a);
                                        if (a3.m().f15123d > i9) {
                                            String substring = str8.substring(i9, a3.m().f15123d);
                                            o6.j.d(substring, "substring(...)");
                                            String quote = Pattern.quote(substring);
                                            o6.j.d(quote, "quote(...)");
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i9 = a3.m().f15124e + 1;
                                        a3 = a3.n();
                                        i8 = i10;
                                    }
                                    if (i9 < str8.length()) {
                                        String substring2 = str8.substring(i9);
                                        o6.j.d(substring2, "substring(...)");
                                        String quote2 = Pattern.quote(substring2);
                                        o6.j.d(quote2, "quote(...)");
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    String sb2 = sb.toString();
                                    o6.j.d(sb2, "toString(...)");
                                    c1139q.f12781a = C1140r.f(sb2);
                                    linkedHashMap.put(str7, c1139q);
                                } else {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                        String str9 = this.f12778e.f12789a;
                        if (str9 != null) {
                            Uri parse2 = Uri.parse(str9);
                            o6.j.d(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri parse3 = Uri.parse(str9);
                                o6.j.d(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb3 = new StringBuilder();
                                o6.j.b(fragment);
                                C1140r.a(fragment, arrayList2, sb3);
                                return new Z5.j(arrayList2, sb3.toString());
                            }
                        }
                        return null;
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                        Z5.j jVar = (Z5.j) this.f12778e.j.getValue();
                        if (jVar == null || (list3 = (List) jVar.f7485d) == null) {
                            return new ArrayList();
                        }
                        return list3;
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                        Z5.j jVar2 = (Z5.j) this.f12778e.j.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.f7486e;
                        }
                        return null;
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str10 = (String) this.f12778e.f12798l.getValue();
                        if (str10 != null) {
                            return new I7.k(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = this.f12778e.f12800n;
                        if (str11 != null) {
                            return new I7.k(str11);
                        }
                        return null;
                }
            }
        });
        final int i8 = 1;
        this.f12795g = new Z5.n(new InterfaceC1162a(this) { // from class: n0.o

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C1140r f12778e;

            {
                this.f12778e = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, Z5.g] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, Z5.g] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, Z5.g] */
            @Override // n6.InterfaceC1162a
            public final Object a() {
                boolean z9;
                List list3;
                switch (i8) {
                    case 0:
                        String str4 = this.f12778e.f12793e;
                        if (str4 != null) {
                            return new I7.k(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = this.f12778e.f12789a;
                        if (str5 != null && C1140r.f12788v.c(str5)) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        return Boolean.valueOf(z9);
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        C1140r c1140r = this.f12778e;
                        String str6 = c1140r.f12789a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) c1140r.f12795g.getValue()).booleanValue()) {
                            o6.j.b(str6);
                            Uri parse = Uri.parse(str6);
                            o6.j.d(parse, "parse(...)");
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                int i82 = 1;
                                if (queryParameters.size() <= 1) {
                                    String str8 = (String) AbstractC0436k.r0(queryParameters);
                                    if (str8 == null) {
                                        c1140r.f12797i = true;
                                        str8 = str7;
                                    }
                                    A4.a a3 = I7.k.a(C1140r.f12784r, str8);
                                    C1139q c1139q = new C1139q();
                                    int i9 = 0;
                                    while (a3 != null) {
                                        I7.h h8 = ((I7.j) a3.f282g).h(i82);
                                        o6.j.b(h8);
                                        int i10 = i82;
                                        c1139q.f12782b.add(h8.f2239a);
                                        if (a3.m().f15123d > i9) {
                                            String substring = str8.substring(i9, a3.m().f15123d);
                                            o6.j.d(substring, "substring(...)");
                                            String quote = Pattern.quote(substring);
                                            o6.j.d(quote, "quote(...)");
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i9 = a3.m().f15124e + 1;
                                        a3 = a3.n();
                                        i82 = i10;
                                    }
                                    if (i9 < str8.length()) {
                                        String substring2 = str8.substring(i9);
                                        o6.j.d(substring2, "substring(...)");
                                        String quote2 = Pattern.quote(substring2);
                                        o6.j.d(quote2, "quote(...)");
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    String sb2 = sb.toString();
                                    o6.j.d(sb2, "toString(...)");
                                    c1139q.f12781a = C1140r.f(sb2);
                                    linkedHashMap.put(str7, c1139q);
                                } else {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                        String str9 = this.f12778e.f12789a;
                        if (str9 != null) {
                            Uri parse2 = Uri.parse(str9);
                            o6.j.d(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri parse3 = Uri.parse(str9);
                                o6.j.d(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb3 = new StringBuilder();
                                o6.j.b(fragment);
                                C1140r.a(fragment, arrayList2, sb3);
                                return new Z5.j(arrayList2, sb3.toString());
                            }
                        }
                        return null;
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                        Z5.j jVar = (Z5.j) this.f12778e.j.getValue();
                        if (jVar == null || (list3 = (List) jVar.f7485d) == null) {
                            return new ArrayList();
                        }
                        return list3;
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                        Z5.j jVar2 = (Z5.j) this.f12778e.j.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.f7486e;
                        }
                        return null;
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str10 = (String) this.f12778e.f12798l.getValue();
                        if (str10 != null) {
                            return new I7.k(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = this.f12778e.f12800n;
                        if (str11 != null) {
                            return new I7.k(str11);
                        }
                        return null;
                }
            }
        });
        final int i9 = 2;
        InterfaceC1162a interfaceC1162a = new InterfaceC1162a(this) { // from class: n0.o

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C1140r f12778e;

            {
                this.f12778e = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, Z5.g] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, Z5.g] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, Z5.g] */
            @Override // n6.InterfaceC1162a
            public final Object a() {
                boolean z9;
                List list3;
                switch (i9) {
                    case 0:
                        String str4 = this.f12778e.f12793e;
                        if (str4 != null) {
                            return new I7.k(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = this.f12778e.f12789a;
                        if (str5 != null && C1140r.f12788v.c(str5)) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        return Boolean.valueOf(z9);
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        C1140r c1140r = this.f12778e;
                        String str6 = c1140r.f12789a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) c1140r.f12795g.getValue()).booleanValue()) {
                            o6.j.b(str6);
                            Uri parse = Uri.parse(str6);
                            o6.j.d(parse, "parse(...)");
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                int i82 = 1;
                                if (queryParameters.size() <= 1) {
                                    String str8 = (String) AbstractC0436k.r0(queryParameters);
                                    if (str8 == null) {
                                        c1140r.f12797i = true;
                                        str8 = str7;
                                    }
                                    A4.a a3 = I7.k.a(C1140r.f12784r, str8);
                                    C1139q c1139q = new C1139q();
                                    int i92 = 0;
                                    while (a3 != null) {
                                        I7.h h8 = ((I7.j) a3.f282g).h(i82);
                                        o6.j.b(h8);
                                        int i10 = i82;
                                        c1139q.f12782b.add(h8.f2239a);
                                        if (a3.m().f15123d > i92) {
                                            String substring = str8.substring(i92, a3.m().f15123d);
                                            o6.j.d(substring, "substring(...)");
                                            String quote = Pattern.quote(substring);
                                            o6.j.d(quote, "quote(...)");
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i92 = a3.m().f15124e + 1;
                                        a3 = a3.n();
                                        i82 = i10;
                                    }
                                    if (i92 < str8.length()) {
                                        String substring2 = str8.substring(i92);
                                        o6.j.d(substring2, "substring(...)");
                                        String quote2 = Pattern.quote(substring2);
                                        o6.j.d(quote2, "quote(...)");
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    String sb2 = sb.toString();
                                    o6.j.d(sb2, "toString(...)");
                                    c1139q.f12781a = C1140r.f(sb2);
                                    linkedHashMap.put(str7, c1139q);
                                } else {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                        String str9 = this.f12778e.f12789a;
                        if (str9 != null) {
                            Uri parse2 = Uri.parse(str9);
                            o6.j.d(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri parse3 = Uri.parse(str9);
                                o6.j.d(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb3 = new StringBuilder();
                                o6.j.b(fragment);
                                C1140r.a(fragment, arrayList2, sb3);
                                return new Z5.j(arrayList2, sb3.toString());
                            }
                        }
                        return null;
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                        Z5.j jVar = (Z5.j) this.f12778e.j.getValue();
                        if (jVar == null || (list3 = (List) jVar.f7485d) == null) {
                            return new ArrayList();
                        }
                        return list3;
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                        Z5.j jVar2 = (Z5.j) this.f12778e.j.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.f7486e;
                        }
                        return null;
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str10 = (String) this.f12778e.f12798l.getValue();
                        if (str10 != null) {
                            return new I7.k(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = this.f12778e.f12800n;
                        if (str11 != null) {
                            return new I7.k(str11);
                        }
                        return null;
                }
            }
        };
        Z5.h hVar = Z5.h.f7483e;
        this.f12796h = Z5.a.c(hVar, interfaceC1162a);
        final int i10 = 3;
        this.j = Z5.a.c(hVar, new InterfaceC1162a(this) { // from class: n0.o

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C1140r f12778e;

            {
                this.f12778e = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, Z5.g] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, Z5.g] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, Z5.g] */
            @Override // n6.InterfaceC1162a
            public final Object a() {
                boolean z9;
                List list3;
                switch (i10) {
                    case 0:
                        String str4 = this.f12778e.f12793e;
                        if (str4 != null) {
                            return new I7.k(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = this.f12778e.f12789a;
                        if (str5 != null && C1140r.f12788v.c(str5)) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        return Boolean.valueOf(z9);
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        C1140r c1140r = this.f12778e;
                        String str6 = c1140r.f12789a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) c1140r.f12795g.getValue()).booleanValue()) {
                            o6.j.b(str6);
                            Uri parse = Uri.parse(str6);
                            o6.j.d(parse, "parse(...)");
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                int i82 = 1;
                                if (queryParameters.size() <= 1) {
                                    String str8 = (String) AbstractC0436k.r0(queryParameters);
                                    if (str8 == null) {
                                        c1140r.f12797i = true;
                                        str8 = str7;
                                    }
                                    A4.a a3 = I7.k.a(C1140r.f12784r, str8);
                                    C1139q c1139q = new C1139q();
                                    int i92 = 0;
                                    while (a3 != null) {
                                        I7.h h8 = ((I7.j) a3.f282g).h(i82);
                                        o6.j.b(h8);
                                        int i102 = i82;
                                        c1139q.f12782b.add(h8.f2239a);
                                        if (a3.m().f15123d > i92) {
                                            String substring = str8.substring(i92, a3.m().f15123d);
                                            o6.j.d(substring, "substring(...)");
                                            String quote = Pattern.quote(substring);
                                            o6.j.d(quote, "quote(...)");
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i92 = a3.m().f15124e + 1;
                                        a3 = a3.n();
                                        i82 = i102;
                                    }
                                    if (i92 < str8.length()) {
                                        String substring2 = str8.substring(i92);
                                        o6.j.d(substring2, "substring(...)");
                                        String quote2 = Pattern.quote(substring2);
                                        o6.j.d(quote2, "quote(...)");
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    String sb2 = sb.toString();
                                    o6.j.d(sb2, "toString(...)");
                                    c1139q.f12781a = C1140r.f(sb2);
                                    linkedHashMap.put(str7, c1139q);
                                } else {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                        String str9 = this.f12778e.f12789a;
                        if (str9 != null) {
                            Uri parse2 = Uri.parse(str9);
                            o6.j.d(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri parse3 = Uri.parse(str9);
                                o6.j.d(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb3 = new StringBuilder();
                                o6.j.b(fragment);
                                C1140r.a(fragment, arrayList2, sb3);
                                return new Z5.j(arrayList2, sb3.toString());
                            }
                        }
                        return null;
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                        Z5.j jVar = (Z5.j) this.f12778e.j.getValue();
                        if (jVar == null || (list3 = (List) jVar.f7485d) == null) {
                            return new ArrayList();
                        }
                        return list3;
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                        Z5.j jVar2 = (Z5.j) this.f12778e.j.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.f7486e;
                        }
                        return null;
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str10 = (String) this.f12778e.f12798l.getValue();
                        if (str10 != null) {
                            return new I7.k(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = this.f12778e.f12800n;
                        if (str11 != null) {
                            return new I7.k(str11);
                        }
                        return null;
                }
            }
        });
        final int i11 = 4;
        this.k = Z5.a.c(hVar, new InterfaceC1162a(this) { // from class: n0.o

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C1140r f12778e;

            {
                this.f12778e = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, Z5.g] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, Z5.g] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, Z5.g] */
            @Override // n6.InterfaceC1162a
            public final Object a() {
                boolean z9;
                List list3;
                switch (i11) {
                    case 0:
                        String str4 = this.f12778e.f12793e;
                        if (str4 != null) {
                            return new I7.k(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = this.f12778e.f12789a;
                        if (str5 != null && C1140r.f12788v.c(str5)) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        return Boolean.valueOf(z9);
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        C1140r c1140r = this.f12778e;
                        String str6 = c1140r.f12789a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) c1140r.f12795g.getValue()).booleanValue()) {
                            o6.j.b(str6);
                            Uri parse = Uri.parse(str6);
                            o6.j.d(parse, "parse(...)");
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                int i82 = 1;
                                if (queryParameters.size() <= 1) {
                                    String str8 = (String) AbstractC0436k.r0(queryParameters);
                                    if (str8 == null) {
                                        c1140r.f12797i = true;
                                        str8 = str7;
                                    }
                                    A4.a a3 = I7.k.a(C1140r.f12784r, str8);
                                    C1139q c1139q = new C1139q();
                                    int i92 = 0;
                                    while (a3 != null) {
                                        I7.h h8 = ((I7.j) a3.f282g).h(i82);
                                        o6.j.b(h8);
                                        int i102 = i82;
                                        c1139q.f12782b.add(h8.f2239a);
                                        if (a3.m().f15123d > i92) {
                                            String substring = str8.substring(i92, a3.m().f15123d);
                                            o6.j.d(substring, "substring(...)");
                                            String quote = Pattern.quote(substring);
                                            o6.j.d(quote, "quote(...)");
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i92 = a3.m().f15124e + 1;
                                        a3 = a3.n();
                                        i82 = i102;
                                    }
                                    if (i92 < str8.length()) {
                                        String substring2 = str8.substring(i92);
                                        o6.j.d(substring2, "substring(...)");
                                        String quote2 = Pattern.quote(substring2);
                                        o6.j.d(quote2, "quote(...)");
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    String sb2 = sb.toString();
                                    o6.j.d(sb2, "toString(...)");
                                    c1139q.f12781a = C1140r.f(sb2);
                                    linkedHashMap.put(str7, c1139q);
                                } else {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                        String str9 = this.f12778e.f12789a;
                        if (str9 != null) {
                            Uri parse2 = Uri.parse(str9);
                            o6.j.d(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri parse3 = Uri.parse(str9);
                                o6.j.d(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb3 = new StringBuilder();
                                o6.j.b(fragment);
                                C1140r.a(fragment, arrayList2, sb3);
                                return new Z5.j(arrayList2, sb3.toString());
                            }
                        }
                        return null;
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                        Z5.j jVar = (Z5.j) this.f12778e.j.getValue();
                        if (jVar == null || (list3 = (List) jVar.f7485d) == null) {
                            return new ArrayList();
                        }
                        return list3;
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                        Z5.j jVar2 = (Z5.j) this.f12778e.j.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.f7486e;
                        }
                        return null;
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str10 = (String) this.f12778e.f12798l.getValue();
                        if (str10 != null) {
                            return new I7.k(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = this.f12778e.f12800n;
                        if (str11 != null) {
                            return new I7.k(str11);
                        }
                        return null;
                }
            }
        });
        final int i12 = 5;
        this.f12798l = Z5.a.c(hVar, new InterfaceC1162a(this) { // from class: n0.o

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C1140r f12778e;

            {
                this.f12778e = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, Z5.g] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, Z5.g] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, Z5.g] */
            @Override // n6.InterfaceC1162a
            public final Object a() {
                boolean z9;
                List list3;
                switch (i12) {
                    case 0:
                        String str4 = this.f12778e.f12793e;
                        if (str4 != null) {
                            return new I7.k(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = this.f12778e.f12789a;
                        if (str5 != null && C1140r.f12788v.c(str5)) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        return Boolean.valueOf(z9);
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        C1140r c1140r = this.f12778e;
                        String str6 = c1140r.f12789a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) c1140r.f12795g.getValue()).booleanValue()) {
                            o6.j.b(str6);
                            Uri parse = Uri.parse(str6);
                            o6.j.d(parse, "parse(...)");
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                int i82 = 1;
                                if (queryParameters.size() <= 1) {
                                    String str8 = (String) AbstractC0436k.r0(queryParameters);
                                    if (str8 == null) {
                                        c1140r.f12797i = true;
                                        str8 = str7;
                                    }
                                    A4.a a3 = I7.k.a(C1140r.f12784r, str8);
                                    C1139q c1139q = new C1139q();
                                    int i92 = 0;
                                    while (a3 != null) {
                                        I7.h h8 = ((I7.j) a3.f282g).h(i82);
                                        o6.j.b(h8);
                                        int i102 = i82;
                                        c1139q.f12782b.add(h8.f2239a);
                                        if (a3.m().f15123d > i92) {
                                            String substring = str8.substring(i92, a3.m().f15123d);
                                            o6.j.d(substring, "substring(...)");
                                            String quote = Pattern.quote(substring);
                                            o6.j.d(quote, "quote(...)");
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i92 = a3.m().f15124e + 1;
                                        a3 = a3.n();
                                        i82 = i102;
                                    }
                                    if (i92 < str8.length()) {
                                        String substring2 = str8.substring(i92);
                                        o6.j.d(substring2, "substring(...)");
                                        String quote2 = Pattern.quote(substring2);
                                        o6.j.d(quote2, "quote(...)");
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    String sb2 = sb.toString();
                                    o6.j.d(sb2, "toString(...)");
                                    c1139q.f12781a = C1140r.f(sb2);
                                    linkedHashMap.put(str7, c1139q);
                                } else {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                        String str9 = this.f12778e.f12789a;
                        if (str9 != null) {
                            Uri parse2 = Uri.parse(str9);
                            o6.j.d(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri parse3 = Uri.parse(str9);
                                o6.j.d(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb3 = new StringBuilder();
                                o6.j.b(fragment);
                                C1140r.a(fragment, arrayList2, sb3);
                                return new Z5.j(arrayList2, sb3.toString());
                            }
                        }
                        return null;
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                        Z5.j jVar = (Z5.j) this.f12778e.j.getValue();
                        if (jVar == null || (list3 = (List) jVar.f7485d) == null) {
                            return new ArrayList();
                        }
                        return list3;
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                        Z5.j jVar2 = (Z5.j) this.f12778e.j.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.f7486e;
                        }
                        return null;
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str10 = (String) this.f12778e.f12798l.getValue();
                        if (str10 != null) {
                            return new I7.k(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = this.f12778e.f12800n;
                        if (str11 != null) {
                            return new I7.k(str11);
                        }
                        return null;
                }
            }
        });
        final int i13 = 6;
        this.f12799m = new Z5.n(new InterfaceC1162a(this) { // from class: n0.o

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C1140r f12778e;

            {
                this.f12778e = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, Z5.g] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, Z5.g] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, Z5.g] */
            @Override // n6.InterfaceC1162a
            public final Object a() {
                boolean z9;
                List list3;
                switch (i13) {
                    case 0:
                        String str4 = this.f12778e.f12793e;
                        if (str4 != null) {
                            return new I7.k(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = this.f12778e.f12789a;
                        if (str5 != null && C1140r.f12788v.c(str5)) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        return Boolean.valueOf(z9);
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        C1140r c1140r = this.f12778e;
                        String str6 = c1140r.f12789a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) c1140r.f12795g.getValue()).booleanValue()) {
                            o6.j.b(str6);
                            Uri parse = Uri.parse(str6);
                            o6.j.d(parse, "parse(...)");
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                int i82 = 1;
                                if (queryParameters.size() <= 1) {
                                    String str8 = (String) AbstractC0436k.r0(queryParameters);
                                    if (str8 == null) {
                                        c1140r.f12797i = true;
                                        str8 = str7;
                                    }
                                    A4.a a3 = I7.k.a(C1140r.f12784r, str8);
                                    C1139q c1139q = new C1139q();
                                    int i92 = 0;
                                    while (a3 != null) {
                                        I7.h h8 = ((I7.j) a3.f282g).h(i82);
                                        o6.j.b(h8);
                                        int i102 = i82;
                                        c1139q.f12782b.add(h8.f2239a);
                                        if (a3.m().f15123d > i92) {
                                            String substring = str8.substring(i92, a3.m().f15123d);
                                            o6.j.d(substring, "substring(...)");
                                            String quote = Pattern.quote(substring);
                                            o6.j.d(quote, "quote(...)");
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i92 = a3.m().f15124e + 1;
                                        a3 = a3.n();
                                        i82 = i102;
                                    }
                                    if (i92 < str8.length()) {
                                        String substring2 = str8.substring(i92);
                                        o6.j.d(substring2, "substring(...)");
                                        String quote2 = Pattern.quote(substring2);
                                        o6.j.d(quote2, "quote(...)");
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    String sb2 = sb.toString();
                                    o6.j.d(sb2, "toString(...)");
                                    c1139q.f12781a = C1140r.f(sb2);
                                    linkedHashMap.put(str7, c1139q);
                                } else {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                        String str9 = this.f12778e.f12789a;
                        if (str9 != null) {
                            Uri parse2 = Uri.parse(str9);
                            o6.j.d(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri parse3 = Uri.parse(str9);
                                o6.j.d(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb3 = new StringBuilder();
                                o6.j.b(fragment);
                                C1140r.a(fragment, arrayList2, sb3);
                                return new Z5.j(arrayList2, sb3.toString());
                            }
                        }
                        return null;
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                        Z5.j jVar = (Z5.j) this.f12778e.j.getValue();
                        if (jVar == null || (list3 = (List) jVar.f7485d) == null) {
                            return new ArrayList();
                        }
                        return list3;
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                        Z5.j jVar2 = (Z5.j) this.f12778e.j.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.f7486e;
                        }
                        return null;
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str10 = (String) this.f12778e.f12798l.getValue();
                        if (str10 != null) {
                            return new I7.k(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = this.f12778e.f12800n;
                        if (str11 != null) {
                            return new I7.k(str11);
                        }
                        return null;
                }
            }
        });
        final int i14 = 7;
        this.f12801o = new Z5.n(new InterfaceC1162a(this) { // from class: n0.o

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C1140r f12778e;

            {
                this.f12778e = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, Z5.g] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, Z5.g] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, Z5.g] */
            @Override // n6.InterfaceC1162a
            public final Object a() {
                boolean z9;
                List list3;
                switch (i14) {
                    case 0:
                        String str4 = this.f12778e.f12793e;
                        if (str4 != null) {
                            return new I7.k(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = this.f12778e.f12789a;
                        if (str5 != null && C1140r.f12788v.c(str5)) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        return Boolean.valueOf(z9);
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        C1140r c1140r = this.f12778e;
                        String str6 = c1140r.f12789a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) c1140r.f12795g.getValue()).booleanValue()) {
                            o6.j.b(str6);
                            Uri parse = Uri.parse(str6);
                            o6.j.d(parse, "parse(...)");
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                int i82 = 1;
                                if (queryParameters.size() <= 1) {
                                    String str8 = (String) AbstractC0436k.r0(queryParameters);
                                    if (str8 == null) {
                                        c1140r.f12797i = true;
                                        str8 = str7;
                                    }
                                    A4.a a3 = I7.k.a(C1140r.f12784r, str8);
                                    C1139q c1139q = new C1139q();
                                    int i92 = 0;
                                    while (a3 != null) {
                                        I7.h h8 = ((I7.j) a3.f282g).h(i82);
                                        o6.j.b(h8);
                                        int i102 = i82;
                                        c1139q.f12782b.add(h8.f2239a);
                                        if (a3.m().f15123d > i92) {
                                            String substring = str8.substring(i92, a3.m().f15123d);
                                            o6.j.d(substring, "substring(...)");
                                            String quote = Pattern.quote(substring);
                                            o6.j.d(quote, "quote(...)");
                                            sb.append(quote);
                                        }
                                        sb.append("([\\s\\S]+?)?");
                                        i92 = a3.m().f15124e + 1;
                                        a3 = a3.n();
                                        i82 = i102;
                                    }
                                    if (i92 < str8.length()) {
                                        String substring2 = str8.substring(i92);
                                        o6.j.d(substring2, "substring(...)");
                                        String quote2 = Pattern.quote(substring2);
                                        o6.j.d(quote2, "quote(...)");
                                        sb.append(quote2);
                                    }
                                    sb.append("$");
                                    String sb2 = sb.toString();
                                    o6.j.d(sb2, "toString(...)");
                                    c1139q.f12781a = C1140r.f(sb2);
                                    linkedHashMap.put(str7, c1139q);
                                } else {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                        String str9 = this.f12778e.f12789a;
                        if (str9 != null) {
                            Uri parse2 = Uri.parse(str9);
                            o6.j.d(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri parse3 = Uri.parse(str9);
                                o6.j.d(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb3 = new StringBuilder();
                                o6.j.b(fragment);
                                C1140r.a(fragment, arrayList2, sb3);
                                return new Z5.j(arrayList2, sb3.toString());
                            }
                        }
                        return null;
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                        Z5.j jVar = (Z5.j) this.f12778e.j.getValue();
                        if (jVar == null || (list3 = (List) jVar.f7485d) == null) {
                            return new ArrayList();
                        }
                        return list3;
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                        Z5.j jVar2 = (Z5.j) this.f12778e.j.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.f7486e;
                        }
                        return null;
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str10 = (String) this.f12778e.f12798l.getValue();
                        if (str10 != null) {
                            return new I7.k(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = this.f12778e.f12800n;
                        if (str11 != null) {
                            return new I7.k(str11);
                        }
                        return null;
                }
            }
        });
        if (str != null) {
            StringBuilder sb = new StringBuilder("^");
            I7.k kVar = f12783q;
            kVar.getClass();
            if (!kVar.f2244d.matcher(str).find()) {
                String pattern = f12785s.f2244d.pattern();
                o6.j.d(pattern, "pattern(...)");
                sb.append(pattern);
            }
            A4.a a3 = I7.k.a(new I7.k("(\\?|#|$)"), str);
            if (a3 != null) {
                String substring = str.substring(0, a3.m().f15123d);
                o6.j.d(substring, "substring(...)");
                a(substring, arrayList, sb);
                I7.k kVar2 = f12786t;
                kVar2.getClass();
                if (!kVar2.f2244d.matcher(sb).find()) {
                    I7.k kVar3 = f12787u;
                    kVar3.getClass();
                    if (!kVar3.f2244d.matcher(sb).find()) {
                        z8 = true;
                        this.f12802p = z8;
                        sb.append("($|(\\?(.)*)|(#(.)*))");
                    }
                }
                z8 = false;
                this.f12802p = z8;
                sb.append("($|(\\?(.)*)|(#(.)*))");
            }
            String sb2 = sb.toString();
            o6.j.d(sb2, "toString(...)");
            this.f12793e = f(sb2);
        }
        if (str3 == null) {
            return;
        }
        Pattern compile = Pattern.compile("^[\\s\\S]+/[\\s\\S]+$");
        o6.j.d(compile, "compile(...)");
        if (compile.matcher(str3).matches()) {
            Pattern compile2 = Pattern.compile("/");
            o6.j.d(compile2, "compile(...)");
            Matcher matcher = compile2.matcher(str3);
            if (!matcher.find()) {
                list = E2.d.y(str3.toString());
            } else {
                ArrayList arrayList2 = new ArrayList(10);
                int i15 = 0;
                do {
                    arrayList2.add(str3.subSequence(i15, matcher.start()).toString());
                    i15 = matcher.end();
                } while (matcher.find());
                arrayList2.add(str3.subSequence(i15, str3.length()).toString());
                list = arrayList2;
            }
            if (!list.isEmpty()) {
                ListIterator listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        list2 = AbstractC0436k.M0(listIterator.nextIndex() + 1, list);
                        break;
                    }
                }
            }
            list2 = a6.s.f7766d;
            this.f12800n = I7.v.Z("^(" + ((String) list2.get(0)) + "|[*]+)/(" + ((String) list2.get(1)) + "|[*]+)$", "*|[*]", "[\\s\\S]");
            return;
        }
        throw new IllegalArgumentException(A.j.p("The given mimeType ", str3, " does not match to required \"type/subtype\" format").toString());
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        int i4 = 0;
        for (A4.a a3 = I7.k.a(f12784r, str); a3 != null; a3 = a3.n()) {
            I7.h h8 = ((I7.j) a3.f282g).h(1);
            o6.j.b(h8);
            arrayList.add(h8.f2239a);
            if (a3.m().f15123d > i4) {
                String substring = str.substring(i4, a3.m().f15123d);
                o6.j.d(substring, "substring(...)");
                String quote = Pattern.quote(substring);
                o6.j.d(quote, "quote(...)");
                sb.append(quote);
            }
            String pattern = f12787u.f2244d.pattern();
            o6.j.d(pattern, "pattern(...)");
            sb.append(pattern);
            i4 = a3.m().f15124e + 1;
        }
        if (i4 < str.length()) {
            String substring2 = str.substring(i4);
            o6.j.d(substring2, "substring(...)");
            String quote2 = Pattern.quote(substring2);
            o6.j.d(quote2, "quote(...)");
            sb.append(quote2);
        }
    }

    public static void e(Bundle bundle, String str, String str2, C1130h c1130h) {
        if (c1130h != null) {
            AbstractC1117G abstractC1117G = c1130h.f12754a;
            o6.j.e(str, "key");
            abstractC1117G.e(bundle, str, abstractC1117G.d(str2));
        } else {
            o6.j.e(str, "key");
            bundle.putString(str, str2);
        }
    }

    public static String f(String str) {
        if (I7.m.b0(str, "\\Q", false) && I7.m.b0(str, "\\E", false)) {
            return I7.v.Z(str, ".*", "\\E.*\\Q");
        }
        if (I7.m.b0(str, "\\.\\*", false)) {
            return I7.v.Z(str, "\\.\\*", ".*");
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, Z5.g] */
    public final ArrayList b() {
        Collection values = ((Map) this.f12796h.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            a6.q.f0(arrayList, ((C1139q) it.next()).f12782b);
        }
        return AbstractC0436k.C0(AbstractC0436k.C0(this.f12792d, arrayList), (List) this.k.getValue());
    }

    public final boolean c(A4.a aVar, Bundle bundle, Map map) {
        ArrayList arrayList = this.f12792d;
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i8 = i4 + 1;
            String str = null;
            if (i4 >= 0) {
                String str2 = (String) next;
                I7.h h8 = ((I7.j) aVar.f282g).h(i8);
                if (h8 != null) {
                    str = Uri.decode(h8.f2239a);
                    o6.j.d(str, "decode(...)");
                }
                if (str == null) {
                    str = "";
                }
                try {
                    e(bundle, str2, str, (C1130h) map.get(str2));
                    arrayList2.add(Z5.y.f7506a);
                    i4 = i8;
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            } else {
                AbstractC0437l.c0();
                throw null;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00db A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, Z5.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(Uri uri, Bundle bundle, Map map) {
        A4.a aVar;
        String str;
        Object obj;
        boolean z8;
        AbstractC1117G abstractC1117G;
        Object obj2;
        String query;
        for (Map.Entry entry : ((Map) this.f12796h.getValue()).entrySet()) {
            String str2 = (String) entry.getKey();
            C1139q c1139q = (C1139q) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str2);
            if (this.f12797i && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = E2.d.y(query);
            }
            Z5.y yVar = Z5.y.f7506a;
            boolean z9 = false;
            Bundle k = X.k((Z5.j[]) Arrays.copyOf(new Z5.j[0], 0));
            Iterator it = c1139q.f12782b.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                C1130h c1130h = (C1130h) map.get(str3);
                if (c1130h != null) {
                    abstractC1117G = c1130h.f12754a;
                } else {
                    abstractC1117G = null;
                }
                if ((abstractC1117G instanceof C1125c) && !c1130h.f12756c) {
                    C1125c c1125c = (C1125c) abstractC1117G;
                    switch (c1125c.f12747r) {
                        case 0:
                            obj2 = new boolean[0];
                            break;
                        case 1:
                        case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                        case Z.g.STRING_FIELD_NUMBER /* 5 */:
                        case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        default:
                            obj2 = a6.s.f7766d;
                            break;
                        case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                            obj2 = new float[0];
                            break;
                        case Z.g.LONG_FIELD_NUMBER /* 4 */:
                            obj2 = new int[0];
                            break;
                        case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                            obj2 = new long[0];
                            break;
                        case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                            obj2 = new String[0];
                            break;
                    }
                    c1125c.e(k, str3, obj2);
                }
            }
            for (String str4 : queryParameters) {
                String str5 = c1139q.f12781a;
                if (str5 != null) {
                    Pattern compile = Pattern.compile(str5);
                    o6.j.d(compile, "compile(...)");
                    o6.j.e(str4, "input");
                    Matcher matcher = compile.matcher(str4);
                    o6.j.d(matcher, "matcher(...)");
                    if (matcher.matches()) {
                        aVar = new A4.a(matcher, str4);
                        if (aVar != null) {
                            return z9;
                        }
                        ArrayList arrayList = c1139q.f12782b;
                        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        ?? r14 = z9;
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            int i4 = r14 + 1;
                            if (r14 >= 0) {
                                String str6 = (String) next;
                                I7.h h8 = ((I7.j) aVar.f282g).h(i4);
                                if (h8 != null) {
                                    str = h8.f2239a;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    str = "";
                                }
                                C1130h c1130h2 = (C1130h) map.get(str6);
                                try {
                                    o6.j.e(str6, "key");
                                } catch (IllegalArgumentException unused) {
                                }
                                if (!k.containsKey(str6)) {
                                    e(k, str6, str, c1130h2);
                                    obj = yVar;
                                    arrayList2.add(obj);
                                    r14 = i4;
                                    z9 = false;
                                } else {
                                    if (!k.containsKey(str6)) {
                                        z8 = true;
                                    } else {
                                        if (c1130h2 != null) {
                                            AbstractC1117G abstractC1117G2 = c1130h2.f12754a;
                                            Object a3 = abstractC1117G2.a(str6, k);
                                            if (k.containsKey(str6)) {
                                                abstractC1117G2.e(k, str6, abstractC1117G2.c(a3, str));
                                            } else {
                                                throw new IllegalArgumentException("There is no previous value in this savedState.");
                                            }
                                        }
                                        z8 = false;
                                    }
                                    obj = Boolean.valueOf(z8);
                                    arrayList2.add(obj);
                                    r14 = i4;
                                    z9 = false;
                                }
                            } else {
                                AbstractC0437l.c0();
                                throw null;
                            }
                        }
                    }
                }
                aVar = null;
                if (aVar != null) {
                }
            }
            bundle.putAll(k);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C1140r)) {
            C1140r c1140r = (C1140r) obj;
            if (o6.j.a(this.f12789a, c1140r.f12789a) && o6.j.a(this.f12790b, c1140r.f12790b) && o6.j.a(this.f12791c, c1140r.f12791c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int i8;
        int i9 = 0;
        String str = this.f12789a;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = i4 * 31;
        String str2 = this.f12790b;
        if (str2 != null) {
            i8 = str2.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = (i10 + i8) * 31;
        String str3 = this.f12791c;
        if (str3 != null) {
            i9 = str3.hashCode();
        }
        return i11 + i9;
    }
}
