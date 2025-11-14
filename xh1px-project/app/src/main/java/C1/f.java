package C1;

import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import O7.V;
import O7.i0;
import P7.AbstractC0285b;
import P7.l;
import Q7.t;
import T3.x;
import X.C0334b;
import X.S;
import X.U;
import X.c0;
import X.d0;
import b2.p;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import l3.C1018q;
import o6.j;
import u0.C1622m;

/* loaded from: classes.dex */
public final class f implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f570d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f571e;

    public /* synthetic */ f(i0 i0Var, int i4) {
        this.f570d = i4;
        this.f571e = i0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(l lVar, AbstractC0713c abstractC0713c) {
        C1622m c1622m;
        int i4;
        if (abstractC0713c instanceof C1622m) {
            c1622m = (C1622m) abstractC0713c;
            int i8 = c1622m.f15249i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c1622m.f15249i = i8 - Integer.MIN_VALUE;
                Object obj = c1622m.f15247g;
                i4 = c1622m.f15249i;
                if (i4 == 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Z5.a.d(obj);
                    throw new KotlinNothingValueException();
                }
                Z5.a.d(obj);
                c1622m.f15249i = 1;
                this.f571e.x(lVar, c1622m);
                return;
            }
        }
        c1622m = new C1622m(this, abstractC0713c);
        Object obj2 = c1622m.f15247g;
        i4 = c1622m.f15249i;
        if (i4 == 0) {
        }
    }

    public c0 b() {
        return (c0) this.f571e.f();
    }

    public void c(Set set) {
        i0 i0Var;
        Object f8;
        int[] iArr;
        int i4;
        j.e(set, "tableIds");
        if (set.isEmpty()) {
            return;
        }
        do {
            i0Var = this.f571e;
            f8 = i0Var.f();
            int[] iArr2 = (int[]) f8;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i8 = 0; i8 < length; i8++) {
                if (set.contains(Integer.valueOf(i8))) {
                    i4 = iArr2[i8] + 1;
                } else {
                    i4 = iArr2[i8];
                }
                iArr[i8] = i4;
            }
            t tVar = AbstractC0285b.f4640b;
            if (f8 == null) {
                f8 = tVar;
            }
        } while (!i0Var.h(f8, iArr));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r6.f6718a > r2.f6718a) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Type inference failed for: r3v4, types: [Q7.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(c0 c0Var) {
        i0 i0Var;
        Object f8;
        c0 c0Var2;
        boolean a3;
        j.e(c0Var, "newState");
        do {
            i0Var = this.f571e;
            f8 = i0Var.f();
            c0Var2 = (c0) f8;
            if (c0Var2 instanceof U) {
                a3 = true;
            } else {
                a3 = j.a(c0Var2, d0.f6722b);
            }
            if (!a3) {
                if (!(c0Var2 instanceof C0334b)) {
                    if (!(c0Var2 instanceof S)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                ?? r32 = AbstractC0285b.f4640b;
                if (f8 == null) {
                    f8 = r32;
                }
                if (c0Var2 == null) {
                    c0Var2 = r32;
                }
            }
            c0Var2 = c0Var;
            ?? r322 = AbstractC0285b.f4640b;
            if (f8 == null) {
            }
            if (c0Var2 == null) {
            }
        } while (!i0Var.h(f8, c0Var2));
    }

    @Override // O7.InterfaceC0233f
    public Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f570d) {
            case 0:
                this.f571e.x(new e(interfaceC0234g, 0), interfaceC0617c);
                return EnumC0646a.f10656d;
            case 1:
                this.f571e.x(new e(interfaceC0234g, 4), interfaceC0617c);
                return EnumC0646a.f10656d;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                this.f571e.x(new x(interfaceC0234g, 16), interfaceC0617c);
                return EnumC0646a.f10656d;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            default:
                this.f571e.x(new C1018q(interfaceC0234g, 5), interfaceC0617c);
                return EnumC0646a.f10656d;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                this.f571e.x(new p(interfaceC0234g, 3), interfaceC0617c);
                return EnumC0646a.f10656d;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                this.f571e.x(new p(interfaceC0234g, 5), interfaceC0617c);
                return EnumC0646a.f10656d;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f571e.x(new p(interfaceC0234g, 7), interfaceC0617c);
                return EnumC0646a.f10656d;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f571e.x(new p(interfaceC0234g, 8), interfaceC0617c);
                return EnumC0646a.f10656d;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                this.f571e.x(new p(interfaceC0234g, 28), interfaceC0617c);
                return EnumC0646a.f10656d;
        }
    }

    public f() {
        this.f570d = 3;
        this.f571e = V.c(d0.f6722b);
    }

    public f(int i4) {
        this.f570d = 10;
        this.f571e = V.c(new int[i4]);
    }
}
