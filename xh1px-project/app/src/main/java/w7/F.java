package w7;

import C6.InterfaceC0007h;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class F extends K {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15951c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15952d;

    public /* synthetic */ F(int i4, Object obj) {
        this.f15951c = i4;
        this.f15952d = obj;
    }

    @Override // w7.O
    public boolean a() {
        switch (this.f15951c) {
            case 1:
                return false;
            default:
                return super.a();
        }
    }

    @Override // w7.O
    public boolean e() {
        switch (this.f15951c) {
            case 1:
                return ((Map) this.f15952d).isEmpty();
            default:
                return super.e();
        }
    }

    @Override // w7.K
    public final M g(J j) {
        switch (this.f15951c) {
            case 0:
                o6.j.e(j, "key");
                if (((ArrayList) this.f15952d).contains(j)) {
                    InterfaceC0007h c6 = j.c();
                    o6.j.c(c6, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                    return U.j((C6.T) c6);
                }
                return null;
            default:
                o6.j.e(j, "key");
                return (M) ((Map) this.f15952d).get(j);
        }
    }
}
