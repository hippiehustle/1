package a7;

import g7.AbstractC0794c;
import g7.C0797f;
import g7.C0799h;

/* renamed from: a7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0440a extends AbstractC0794c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8000a;

    public /* synthetic */ C0440a(int i4) {
        this.f8000a = i4;
    }

    @Override // g7.v
    public final Object a(C0797f c0797f, C0799h c0799h) {
        switch (this.f8000a) {
            case 0:
                return new C0447h(c0797f, c0799h);
            case 1:
                return new C0445f(c0797f, c0799h);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0444e(c0797f, c0799h);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0450k(c0797f, c0799h);
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return new C0451l(c0797f);
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return new C0453n(c0797f, c0799h);
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C0455p(c0797f, c0799h);
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C0458t(c0797f, c0799h);
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return new C0460v(c0797f, c0799h);
            case 9:
                return new C0463y(c0797f, c0799h);
            case 10:
                return new C0439A(c0797f, c0799h);
            case 11:
                return new E(c0797f, c0799h);
            case 12:
                return new G(c0797f, c0799h);
            case 13:
                return new I(c0797f, c0799h);
            case 14:
                return new M(c0797f, c0799h);
            case 15:
                return new L(c0797f);
            case 16:
                return new N(c0797f);
            case 17:
                return new T(c0797f, c0799h);
            case 18:
                return new Q(c0797f, c0799h);
            case 19:
                return new V(c0797f, c0799h);
            case 20:
                return new Y(c0797f, c0799h);
            case 21:
                return new Z(c0797f, c0799h);
            case 22:
                return new b0(c0797f, c0799h);
            case 23:
                return new f0(c0797f);
            case 24:
                return new g0(c0797f, c0799h);
            case 25:
                return new d7.b(c0797f);
            case 26:
                return new d7.c(c0797f);
            case 27:
                return new d7.e(c0797f, c0799h);
            case 28:
                return new d7.j(c0797f, c0799h);
            default:
                return new d7.i(c0797f);
        }
    }
}
