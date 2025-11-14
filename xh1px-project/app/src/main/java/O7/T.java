package O7;

import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class T extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public U f4093g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0234g f4094h;

    /* renamed from: i, reason: collision with root package name */
    public W f4095i;
    public L7.X j;
    public /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ U f4096l;

    /* renamed from: m, reason: collision with root package name */
    public int f4097m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u8, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f4096l = u8;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.k = obj;
        this.f4097m |= Integer.MIN_VALUE;
        U.h(this.f4096l, null, this);
        return EnumC0646a.f10656d;
    }
}
