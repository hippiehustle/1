package D6;

import P.S;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.x;
import g6.C0790b;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ p[] f1057A;

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ C0790b f1058B;

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f1059e;

    /* renamed from: f, reason: collision with root package name */
    public static final p f1060f;

    /* renamed from: g, reason: collision with root package name */
    public static final p f1061g;

    /* renamed from: h, reason: collision with root package name */
    public static final p f1062h;

    /* renamed from: i, reason: collision with root package name */
    public static final p f1063i;
    public static final p j;
    public static final p k;

    /* renamed from: l, reason: collision with root package name */
    public static final p f1064l;

    /* renamed from: m, reason: collision with root package name */
    public static final p f1065m;

    /* renamed from: n, reason: collision with root package name */
    public static final p f1066n;

    /* renamed from: o, reason: collision with root package name */
    public static final p f1067o;

    /* renamed from: p, reason: collision with root package name */
    public static final p f1068p;

    /* renamed from: q, reason: collision with root package name */
    public static final p f1069q;

    /* renamed from: r, reason: collision with root package name */
    public static final p f1070r;

    /* renamed from: s, reason: collision with root package name */
    public static final p f1071s;

    /* renamed from: t, reason: collision with root package name */
    public static final p f1072t;

    /* renamed from: u, reason: collision with root package name */
    public static final p f1073u;

    /* renamed from: v, reason: collision with root package name */
    public static final p f1074v;

    /* renamed from: w, reason: collision with root package name */
    public static final p f1075w;

    /* renamed from: x, reason: collision with root package name */
    public static final p f1076x;

    /* renamed from: y, reason: collision with root package name */
    public static final p f1077y;

    /* renamed from: z, reason: collision with root package name */
    public static final p f1078z;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1079d;

    static {
        p pVar = new p("CLASS", 0, true);
        f1060f = pVar;
        p pVar2 = new p("ANNOTATION_CLASS", 1, true);
        f1061g = pVar2;
        p pVar3 = new p("TYPE_PARAMETER", 2, false);
        f1062h = pVar3;
        p pVar4 = new p("PROPERTY", 3, true);
        f1063i = pVar4;
        p pVar5 = new p("FIELD", 4, true);
        j = pVar5;
        p pVar6 = new p("LOCAL_VARIABLE", 5, true);
        k = pVar6;
        p pVar7 = new p("VALUE_PARAMETER", 6, true);
        f1064l = pVar7;
        p pVar8 = new p("CONSTRUCTOR", 7, true);
        f1065m = pVar8;
        p pVar9 = new p("FUNCTION", 8, true);
        f1066n = pVar9;
        p pVar10 = new p("PROPERTY_GETTER", 9, true);
        f1067o = pVar10;
        p pVar11 = new p("PROPERTY_SETTER", 10, true);
        f1068p = pVar11;
        p pVar12 = new p("TYPE", 11, false);
        f1069q = pVar12;
        p pVar13 = new p("EXPRESSION", 12, false);
        p pVar14 = new p("FILE", 13, false);
        f1070r = pVar14;
        p pVar15 = new p("TYPEALIAS", 14, false);
        p pVar16 = new p("TYPE_PROJECTION", 15, false);
        p pVar17 = new p("STAR_PROJECTION", 16, false);
        p pVar18 = new p("PROPERTY_PARAMETER", 17, false);
        p pVar19 = new p("CLASS_ONLY", 18, false);
        f1071s = pVar19;
        p pVar20 = new p("OBJECT", 19, false);
        f1072t = pVar20;
        p pVar21 = new p("STANDALONE_OBJECT", 20, false);
        f1073u = pVar21;
        p pVar22 = new p("COMPANION_OBJECT", 21, false);
        f1074v = pVar22;
        p pVar23 = new p("INTERFACE", 22, false);
        f1075w = pVar23;
        p pVar24 = new p("ENUM_CLASS", 23, false);
        f1076x = pVar24;
        p pVar25 = new p("ENUM_ENTRY", 24, false);
        f1077y = pVar25;
        p pVar26 = new p("LOCAL_CLASS", 25, false);
        f1078z = pVar26;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9, pVar10, pVar11, pVar12, pVar13, pVar14, pVar15, pVar16, pVar17, pVar18, pVar19, pVar20, pVar21, pVar22, pVar23, pVar24, pVar25, pVar26, new p("LOCAL_FUNCTION", 26, false), new p("MEMBER_FUNCTION", 27, false), new p("TOP_LEVEL_FUNCTION", 28, false), new p("MEMBER_PROPERTY", 29, false), new p("MEMBER_PROPERTY_WITH_BACKING_FIELD", 30, false), new p("MEMBER_PROPERTY_WITH_DELEGATE", 31, false), new p("MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 32, false), new p("TOP_LEVEL_PROPERTY", 33, false), new p("TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", 34, false), new p("TOP_LEVEL_PROPERTY_WITH_DELEGATE", 35, false), new p("TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 36, false), new p("BACKING_FIELD", 37, true), new p("INITIALIZER", 38, false), new p("DESTRUCTURING_DECLARATION", 39, false), new p("LAMBDA_EXPRESSION", 40, false), new p("ANONYMOUS_FUNCTION", 41, false), new p("OBJECT_LITERAL", 42, false)};
        f1057A = pVarArr;
        C0790b c0790b = new C0790b(pVarArr);
        f1058B = c0790b;
        f1059e = new HashMap();
        S s8 = new S(6, c0790b);
        while (s8.hasNext()) {
            p pVar27 = (p) s8.next();
            f1059e.put(pVar27.name(), pVar27);
        }
        C0790b c0790b2 = f1058B;
        ArrayList arrayList = new ArrayList();
        c0790b2.getClass();
        S s9 = new S(6, c0790b2);
        while (s9.hasNext()) {
            Object next = s9.next();
            if (((p) next).f1079d) {
                arrayList.add(next);
            }
        }
        AbstractC0436k.V0(arrayList);
        AbstractC0436k.V0(f1058B);
        p pVar28 = f1061g;
        p pVar29 = f1060f;
        AbstractC0437l.X(pVar28, pVar29);
        AbstractC0437l.X(f1078z, pVar29);
        AbstractC0437l.X(f1071s, pVar29);
        p pVar30 = f1074v;
        p pVar31 = f1072t;
        AbstractC0437l.X(pVar30, pVar31, pVar29);
        AbstractC0437l.X(f1073u, pVar31, pVar29);
        AbstractC0437l.X(f1075w, pVar29);
        AbstractC0437l.X(f1076x, pVar29);
        p pVar32 = f1077y;
        p pVar33 = f1063i;
        p pVar34 = j;
        AbstractC0437l.X(pVar32, pVar33, pVar34);
        p pVar35 = f1068p;
        E2.d.y(pVar35);
        p pVar36 = f1067o;
        E2.d.y(pVar36);
        E2.d.y(f1066n);
        p pVar37 = f1070r;
        E2.d.y(pVar37);
        e eVar = e.k;
        p pVar38 = f1064l;
        x.P0(new Z5.j(eVar, pVar38), new Z5.j(e.f1027e, pVar34), new Z5.j(e.f1029g, pVar33), new Z5.j(e.f1028f, pVar37), new Z5.j(e.f1030h, pVar36), new Z5.j(e.f1031i, pVar35), new Z5.j(e.j, pVar38), new Z5.j(e.f1032l, pVar38), new Z5.j(e.f1033m, pVar34));
    }

    public p(String str, int i4, boolean z8) {
        this.f1079d = z8;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f1057A.clone();
    }
}
