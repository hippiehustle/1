package w6;

import I6.AbstractC0065d;
import java.lang.reflect.Type;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class n0 implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15887d;

    /* renamed from: e, reason: collision with root package name */
    public final o0 f15888e;

    public /* synthetic */ n0(o0 o0Var, int i4) {
        this.f15887d = i4;
        this.f15888e = o0Var;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        Type type;
        switch (this.f15887d) {
            case 0:
                o0 o0Var = this.f15888e;
                return o0Var.a(o0Var.f15892a);
            default:
                s0 s0Var = this.f15888e.f15893b;
                if (s0Var != null) {
                    type = (Type) s0Var.a();
                } else {
                    type = null;
                }
                o6.j.b(type);
                return AbstractC0065d.c(type);
        }
    }
}
