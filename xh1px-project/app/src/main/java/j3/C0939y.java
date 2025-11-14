package j3;

import D4.C0040p;
import M3.V;
import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import android.content.Context;
import d6.InterfaceC0617c;
import e6.EnumC0646a;

/* renamed from: j3.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0939y implements InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0040p f11907e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f11908f;

    public /* synthetic */ C0939y(C0040p c0040p, Context context, int i4) {
        this.f11906d = i4;
        this.f11907e = c0040p;
        this.f11908f = context;
    }

    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f11906d) {
            case 0:
                Object x8 = this.f11907e.x(new V(interfaceC0234g, this.f11908f, 2), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x8;
            default:
                Object x9 = this.f11907e.x(new V(interfaceC0234g, this.f11908f, 6), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x9;
        }
    }
}
