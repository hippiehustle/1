package t7;

import I7.v;
import b7.AbstractC0543b;
import f7.C0723c;
import f7.C0724d;
import g7.C0799h;
import g7.n;
import o6.j;

/* renamed from: t7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1591a extends r7.a {

    /* renamed from: m, reason: collision with root package name */
    public static final C1591a f15138m;

    /* JADX WARN: Type inference failed for: r0v0, types: [t7.a, r7.a] */
    static {
        C0799h c0799h = new C0799h();
        AbstractC0543b.a(c0799h);
        n nVar = AbstractC0543b.f9243a;
        j.d(nVar, "packageFqName");
        n nVar2 = AbstractC0543b.f9245c;
        j.d(nVar2, "constructorAnnotation");
        n nVar3 = AbstractC0543b.f9244b;
        j.d(nVar3, "classAnnotation");
        n nVar4 = AbstractC0543b.f9246d;
        j.d(nVar4, "functionAnnotation");
        n nVar5 = AbstractC0543b.f9247e;
        j.d(nVar5, "propertyAnnotation");
        n nVar6 = AbstractC0543b.f9248f;
        j.d(nVar6, "propertyGetterAnnotation");
        n nVar7 = AbstractC0543b.f9249g;
        j.d(nVar7, "propertySetterAnnotation");
        n nVar8 = AbstractC0543b.f9251i;
        j.d(nVar8, "enumEntryAnnotation");
        n nVar9 = AbstractC0543b.f9250h;
        j.d(nVar9, "compileTimeValue");
        n nVar10 = AbstractC0543b.j;
        j.d(nVar10, "parameterAnnotation");
        n nVar11 = AbstractC0543b.k;
        j.d(nVar11, "typeAnnotation");
        n nVar12 = AbstractC0543b.f9252l;
        j.d(nVar12, "typeParameterAnnotation");
        f15138m = new r7.a(c0799h, nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8, nVar9, nVar10, nVar11, nVar12);
    }

    public static String a(C0723c c0723c) {
        String b4;
        j.e(c0723c, "fqName");
        StringBuilder sb = new StringBuilder();
        C0724d c0724d = c0723c.f10797a;
        sb.append(v.Y(c0724d.f10800a, '.', '/'));
        sb.append('/');
        if (c0724d.c()) {
            b4 = "default-package";
        } else {
            b4 = c0724d.f().b();
            j.d(b4, "asString(...)");
        }
        sb.append(b4.concat(".kotlin_builtins"));
        return sb.toString();
    }
}
