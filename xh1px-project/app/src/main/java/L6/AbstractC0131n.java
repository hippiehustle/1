package L6;

import a6.AbstractC0438m;
import c7.AbstractC0585d;
import c7.AbstractC0586e;
import c7.C0583b;
import c7.C0584c;
import g6.C0790b;
import g6.InterfaceC0789a;
import java.util.ArrayList;

/* renamed from: L6.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0131n {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ u6.s[] f3149a;

    /* renamed from: b, reason: collision with root package name */
    public static final A4.c f3150b;

    /* renamed from: c, reason: collision with root package name */
    public static final A.i f3151c;

    static {
        o6.m mVar = new o6.m(AbstractC0131n.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmClass;)Z", 1);
        o6.w wVar = o6.v.f13643a;
        f3149a = new u6.s[]{wVar.d(mVar), A.j.u(AbstractC0131n.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmConstructor;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmFunction;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmProperty;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmValueParameter;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmTypeAlias;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "modality", "getModality(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Modality;", 1, wVar), A.j.u(AbstractC0131n.class, "visibility", "getVisibility(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Visibility;", 1, wVar), A.j.u(AbstractC0131n.class, "kind", "getKind(Lkotlin/metadata/KmClass;)Lkotlin/metadata/ClassKind;", 1, wVar), A.j.u(AbstractC0131n.class, "isInner", "isInner(Lkotlin/metadata/KmClass;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "isData", "isData(Lkotlin/metadata/KmClass;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "isExternal", "isExternal(Lkotlin/metadata/KmClass;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "isExpect", "isExpect(Lkotlin/metadata/KmClass;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "isValue", "isValue(Lkotlin/metadata/KmClass;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "isFunInterface", "isFunInterface(Lkotlin/metadata/KmClass;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "hasEnumEntries", "getHasEnumEntries(Lkotlin/metadata/KmClass;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "visibility", "getVisibility(Lkotlin/metadata/KmConstructor;)Lkotlin/metadata/Visibility;", 1, wVar), A.j.u(AbstractC0131n.class, "isSecondary", "isSecondary(Lkotlin/metadata/KmConstructor;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmConstructor;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "kind", "getKind(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/MemberKind;", 1, wVar), A.j.u(AbstractC0131n.class, "visibility", "getVisibility(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Visibility;", 1, wVar), A.j.u(AbstractC0131n.class, "modality", "getModality(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Modality;", 1, wVar), A.j.u(AbstractC0131n.class, "isOperator", "isOperator(Lkotlin/metadata/KmFunction;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "isInfix", "isInfix(Lkotlin/metadata/KmFunction;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "isInline", "isInline(Lkotlin/metadata/KmFunction;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "isTailrec", "isTailrec(Lkotlin/metadata/KmFunction;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "isExternal", "isExternal(Lkotlin/metadata/KmFunction;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmFunction;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "isExpect", "isExpect(Lkotlin/metadata/KmFunction;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmFunction;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "visibility", "getVisibility(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Visibility;", 1, wVar), A.j.u(AbstractC0131n.class, "modality", "getModality(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Modality;", 1, wVar), A.j.u(AbstractC0131n.class, "kind", "getKind(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/MemberKind;", 1, wVar), A.j.u(AbstractC0131n.class, "isVar", "isVar(Lkotlin/metadata/KmProperty;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "isConst", "isConst(Lkotlin/metadata/KmProperty;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "isLateinit", "isLateinit(Lkotlin/metadata/KmProperty;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "hasConstant", "getHasConstant(Lkotlin/metadata/KmProperty;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "isExternal", "isExternal(Lkotlin/metadata/KmProperty;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "isDelegated", "isDelegated(Lkotlin/metadata/KmProperty;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "isExpect", "isExpect(Lkotlin/metadata/KmProperty;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "visibility", "getVisibility(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Visibility;", 1, wVar), A.j.u(AbstractC0131n.class, "modality", "getModality(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Modality;", 1, wVar), A.j.u(AbstractC0131n.class, "isNotDefault", "isNotDefault(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "isExternal", "isExternal(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "isInline", "isInline(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "isNullable", "isNullable(Lkotlin/metadata/KmType;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmType;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "isDefinitelyNonNull", "isDefinitelyNonNull(Lkotlin/metadata/KmType;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "isReified", "isReified(Lkotlin/metadata/KmTypeParameter;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "visibility", "getVisibility(Lkotlin/metadata/KmTypeAlias;)Lkotlin/metadata/Visibility;", 1, wVar), A.j.u(AbstractC0131n.class, "declaresDefaultValue", "getDeclaresDefaultValue(Lkotlin/metadata/KmValueParameter;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "isCrossinline", "isCrossinline(Lkotlin/metadata/KmValueParameter;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "isNoinline", "isNoinline(Lkotlin/metadata/KmValueParameter;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "isNegated", "isNegated(Lkotlin/metadata/KmEffectExpression;)Z", 1, wVar), A.j.u(AbstractC0131n.class, "isNullCheckPredicate", "isNullCheckPredicate(Lkotlin/metadata/KmEffectExpression;)Z", 1, wVar)};
        C0583b c0583b = AbstractC0586e.f9699c;
        o6.j.d(c0583b, "HAS_ANNOTATIONS");
        M6.h hVar = new M6.h(c0583b);
        M6.a aVar = M6.a.k;
        if (hVar.f3495b == 1 && hVar.f3496c == 1) {
            M6.h hVar2 = new M6.h(c0583b);
            int i4 = M6.b.k;
            if (hVar2.f3495b == 1) {
                q4.X.u(new M6.h(c0583b));
                M6.h hVar3 = new M6.h(c0583b);
                M6.e eVar = M6.e.k;
                if (hVar3.f3495b == 1 && hVar3.f3496c == 1) {
                    q4.X.J(new M6.h(c0583b));
                    q4.X.d0(new M6.h(c0583b));
                    M6.h hVar4 = new M6.h(c0583b);
                    if (hVar4.f3495b == 1) {
                        q4.X.E(C0123f.k);
                        q4.X.e0(C0129l.k);
                        C0119b c0119b = C0119b.k;
                        C0584c c0584c = AbstractC0586e.f9702f;
                        o6.j.d(c0584c, "CLASS_KIND");
                        C0790b c0790b = EnumC0132o.f3155h;
                        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(c0790b, 10));
                        P.S s8 = new P.S(6, c0790b);
                        while (s8.hasNext()) {
                            arrayList.add(((EnumC0132o) s8.next()).f3156d);
                        }
                        f3150b = new A4.c(c0119b, c0584c, c0790b, arrayList);
                        C0583b c0583b2 = AbstractC0586e.f9703g;
                        o6.j.d(c0583b2, "IS_INNER");
                        M6.h hVar5 = new M6.h(c0583b2);
                        M6.a aVar2 = M6.a.k;
                        if (hVar5.f3495b == 1 && hVar5.f3496c == 1) {
                            C0583b c0583b3 = AbstractC0586e.f9704h;
                            o6.j.d(c0583b3, "IS_DATA");
                            M6.h hVar6 = new M6.h(c0583b3);
                            if (hVar6.f3495b == 1 && hVar6.f3496c == 1) {
                                C0583b c0583b4 = AbstractC0586e.f9705i;
                                o6.j.d(c0583b4, "IS_EXTERNAL_CLASS");
                                M6.h hVar7 = new M6.h(c0583b4);
                                if (hVar7.f3495b == 1 && hVar7.f3496c == 1) {
                                    C0583b c0583b5 = AbstractC0586e.j;
                                    o6.j.d(c0583b5, "IS_EXPECT_CLASS");
                                    M6.h hVar8 = new M6.h(c0583b5);
                                    if (hVar8.f3495b == 1 && hVar8.f3496c == 1) {
                                        C0583b c0583b6 = AbstractC0586e.k;
                                        o6.j.d(c0583b6, "IS_VALUE_CLASS");
                                        f3151c = new A.i(aVar2, new M6.h(c0583b6));
                                        C0583b c0583b7 = AbstractC0586e.f9706l;
                                        o6.j.d(c0583b7, "IS_FUN_INTERFACE");
                                        M6.h hVar9 = new M6.h(c0583b7);
                                        if (hVar9.f3495b == 1 && hVar9.f3496c == 1) {
                                            C0583b c0583b8 = AbstractC0586e.f9707m;
                                            o6.j.d(c0583b8, "HAS_ENUM_ENTRIES");
                                            M6.h hVar10 = new M6.h(c0583b8);
                                            if (hVar10.f3495b == 1 && hVar10.f3496c == 1) {
                                                q4.X.e0(C0130m.k);
                                                C0583b c0583b9 = AbstractC0586e.f9708n;
                                                o6.j.d(c0583b9, "IS_SECONDARY");
                                                M6.h hVar11 = new M6.h(c0583b9);
                                                int i8 = M6.b.k;
                                                if (hVar11.f3495b == 1) {
                                                    C0583b c0583b10 = AbstractC0586e.f9709o;
                                                    o6.j.d(c0583b10, "IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES");
                                                    M6.h hVar12 = new M6.h(c0583b10);
                                                    if (hVar12.f3495b == 1) {
                                                        q4.X.D(C0120c.k);
                                                        q4.X.e0(C0125h.k);
                                                        q4.X.E(C0124g.k);
                                                        C0583b c0583b11 = AbstractC0586e.f9711q;
                                                        o6.j.d(c0583b11, "IS_OPERATOR");
                                                        q4.X.u(new M6.h(c0583b11));
                                                        C0583b c0583b12 = AbstractC0586e.f9712r;
                                                        o6.j.d(c0583b12, "IS_INFIX");
                                                        q4.X.u(new M6.h(c0583b12));
                                                        C0583b c0583b13 = AbstractC0586e.f9713s;
                                                        o6.j.d(c0583b13, "IS_INLINE");
                                                        q4.X.u(new M6.h(c0583b13));
                                                        C0583b c0583b14 = AbstractC0586e.f9714t;
                                                        o6.j.d(c0583b14, "IS_TAILREC");
                                                        q4.X.u(new M6.h(c0583b14));
                                                        C0583b c0583b15 = AbstractC0586e.f9715u;
                                                        o6.j.d(c0583b15, "IS_EXTERNAL_FUNCTION");
                                                        q4.X.u(new M6.h(c0583b15));
                                                        C0583b c0583b16 = AbstractC0586e.f9716v;
                                                        o6.j.d(c0583b16, "IS_SUSPEND");
                                                        q4.X.u(new M6.h(c0583b16));
                                                        C0583b c0583b17 = AbstractC0586e.f9717w;
                                                        o6.j.d(c0583b17, "IS_EXPECT_FUNCTION");
                                                        q4.X.u(new M6.h(c0583b17));
                                                        C0583b c0583b18 = AbstractC0586e.f9718x;
                                                        o6.j.d(c0583b18, "IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES");
                                                        q4.X.u(new M6.h(c0583b18));
                                                        q4.X.e0(C0126i.k);
                                                        q4.X.E(C0121d.k);
                                                        q4.X.D(C0118a.k);
                                                        C0583b c0583b19 = AbstractC0586e.f9719y;
                                                        o6.j.d(c0583b19, "IS_VAR");
                                                        M6.h hVar13 = new M6.h(c0583b19);
                                                        M6.e eVar2 = M6.e.k;
                                                        if (hVar13.f3495b == 1 && hVar13.f3496c == 1) {
                                                            C0583b c0583b20 = AbstractC0586e.f9683B;
                                                            o6.j.d(c0583b20, "IS_CONST");
                                                            M6.h hVar14 = new M6.h(c0583b20);
                                                            if (hVar14.f3495b == 1 && hVar14.f3496c == 1) {
                                                                C0583b c0583b21 = AbstractC0586e.f9684C;
                                                                o6.j.d(c0583b21, "IS_LATEINIT");
                                                                M6.h hVar15 = new M6.h(c0583b21);
                                                                if (hVar15.f3495b == 1 && hVar15.f3496c == 1) {
                                                                    C0583b c0583b22 = AbstractC0586e.f9685D;
                                                                    o6.j.d(c0583b22, "HAS_CONSTANT");
                                                                    M6.h hVar16 = new M6.h(c0583b22);
                                                                    if (hVar16.f3495b == 1 && hVar16.f3496c == 1) {
                                                                        C0583b c0583b23 = AbstractC0586e.f9686E;
                                                                        o6.j.d(c0583b23, "IS_EXTERNAL_PROPERTY");
                                                                        M6.h hVar17 = new M6.h(c0583b23);
                                                                        if (hVar17.f3495b == 1 && hVar17.f3496c == 1) {
                                                                            C0583b c0583b24 = AbstractC0586e.f9687F;
                                                                            o6.j.d(c0583b24, "IS_DELEGATED");
                                                                            M6.h hVar18 = new M6.h(c0583b24);
                                                                            if (hVar18.f3495b == 1 && hVar18.f3496c == 1) {
                                                                                C0583b c0583b25 = AbstractC0586e.f9688G;
                                                                                o6.j.d(c0583b25, "IS_EXPECT_PROPERTY");
                                                                                M6.h hVar19 = new M6.h(c0583b25);
                                                                                if (hVar19.f3495b == 1 && hVar19.f3496c == 1) {
                                                                                    q4.X.e0(C0127j.k);
                                                                                    q4.X.E(C0122e.k);
                                                                                    C0583b c0583b26 = AbstractC0586e.K;
                                                                                    o6.j.d(c0583b26, "IS_NOT_DEFAULT");
                                                                                    q4.X.J(new M6.h(c0583b26));
                                                                                    C0583b c0583b27 = AbstractC0586e.f9692L;
                                                                                    o6.j.d(c0583b27, "IS_EXTERNAL_ACCESSOR");
                                                                                    q4.X.J(new M6.h(c0583b27));
                                                                                    C0583b c0583b28 = AbstractC0586e.f9693M;
                                                                                    o6.j.d(c0583b28, "IS_INLINE_ACCESSOR");
                                                                                    q4.X.J(new M6.h(c0583b28));
                                                                                    int i9 = M6.f.k;
                                                                                    C0583b c0583b29 = AbstractC0586e.f9697a;
                                                                                    int i10 = c0583b29.f9680a + 1;
                                                                                    int i11 = c0583b29.f9681b;
                                                                                    M6.h hVar20 = new M6.h(i10, i11, 1);
                                                                                    if (i11 == 1) {
                                                                                        C0583b c0583b30 = AbstractC0586e.f9698b;
                                                                                        int i12 = c0583b30.f9680a + 1;
                                                                                        int i13 = c0583b30.f9681b;
                                                                                        M6.h hVar21 = new M6.h(i12, i13, 1);
                                                                                        if (i13 == 1) {
                                                                                            q4.X.e0(C0128k.k);
                                                                                            C0583b c0583b31 = AbstractC0586e.f9689H;
                                                                                            o6.j.d(c0583b31, "DECLARES_DEFAULT_VALUE");
                                                                                            q4.X.d0(new M6.h(c0583b31));
                                                                                            C0583b c0583b32 = AbstractC0586e.f9690I;
                                                                                            o6.j.d(c0583b32, "IS_CROSSINLINE");
                                                                                            q4.X.d0(new M6.h(c0583b32));
                                                                                            C0583b c0583b33 = AbstractC0586e.f9691J;
                                                                                            o6.j.d(c0583b33, "IS_NOINLINE");
                                                                                            q4.X.d0(new M6.h(c0583b33));
                                                                                            C0583b c0583b34 = AbstractC0586e.f9694N;
                                                                                            o6.j.d(c0583b34, "IS_NEGATED");
                                                                                            M6.h hVar22 = new M6.h(c0583b34);
                                                                                            if (hVar22.f3495b == 1) {
                                                                                                C0583b c0583b35 = AbstractC0586e.f9695O;
                                                                                                o6.j.d(c0583b35, "IS_NULL_CHECK_PREDICATE");
                                                                                                M6.h hVar23 = new M6.h(c0583b35);
                                                                                                if (hVar23.f3495b == 1) {
                                                                                                    return;
                                                                                                } else {
                                                                                                    throw new IllegalArgumentException(A.j.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar23, " was passed").toString());
                                                                                                }
                                                                                            }
                                                                                            throw new IllegalArgumentException(A.j.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar22, " was passed").toString());
                                                                                        }
                                                                                        throw new IllegalArgumentException(A.j.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar21, " was passed").toString());
                                                                                    }
                                                                                    throw new IllegalArgumentException(A.j.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar20, " was passed").toString());
                                                                                }
                                                                                throw new IllegalArgumentException(A.j.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar19, " was passed").toString());
                                                                            }
                                                                            throw new IllegalArgumentException(A.j.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar18, " was passed").toString());
                                                                        }
                                                                        throw new IllegalArgumentException(A.j.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar17, " was passed").toString());
                                                                    }
                                                                    throw new IllegalArgumentException(A.j.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar16, " was passed").toString());
                                                                }
                                                                throw new IllegalArgumentException(A.j.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar15, " was passed").toString());
                                                            }
                                                            throw new IllegalArgumentException(A.j.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar14, " was passed").toString());
                                                        }
                                                        throw new IllegalArgumentException(A.j.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar13, " was passed").toString());
                                                    }
                                                    throw new IllegalArgumentException(A.j.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar12, " was passed").toString());
                                                }
                                                throw new IllegalArgumentException(A.j.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar11, " was passed").toString());
                                            }
                                            throw new IllegalArgumentException(A.j.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar10, " was passed").toString());
                                        }
                                        throw new IllegalArgumentException(A.j.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar9, " was passed").toString());
                                    }
                                    throw new IllegalArgumentException(A.j.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar8, " was passed").toString());
                                }
                                throw new IllegalArgumentException(A.j.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar7, " was passed").toString());
                            }
                            throw new IllegalArgumentException(A.j.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar6, " was passed").toString());
                        }
                        throw new IllegalArgumentException(A.j.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar5, " was passed").toString());
                    }
                    throw new IllegalArgumentException(A.j.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar4, " was passed").toString());
                }
                throw new IllegalArgumentException(A.j.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar3, " was passed").toString());
            }
            throw new IllegalArgumentException(A.j.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar2, " was passed").toString());
        }
        throw new IllegalArgumentException(A.j.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar, " was passed").toString());
    }

    public static final EnumC0132o a(L l6) {
        u6.s sVar = f3149a[9];
        A4.c cVar = f3150b;
        cVar.getClass();
        o6.j.e(sVar, "property");
        return (EnumC0132o) ((Enum) ((C0790b) ((InterfaceC0789a) cVar.f293g)).get(((g7.p) ((AbstractC0585d) cVar.f292f).c(((Number) ((o6.m) cVar.f291e).get(l6)).intValue())).a()));
    }
}
