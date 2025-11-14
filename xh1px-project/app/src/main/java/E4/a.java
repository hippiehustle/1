package E4;

import com.google.android.material.card.MaterialCardView;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;
import t0.s0;

/* loaded from: classes.dex */
public final class a extends s0 {

    /* renamed from: u, reason: collision with root package name */
    public final A4.a f1194u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC1164c f1195v;

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC1163b f1196w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(A4.a aVar, InterfaceC1164c interfaceC1164c, InterfaceC1163b interfaceC1163b) {
        super((MaterialCardView) aVar.f280e);
        o6.j.e(interfaceC1164c, "bitmapProvider");
        o6.j.e(interfaceC1163b, "onConditionClicked");
        this.f1194u = aVar;
        this.f1195v = interfaceC1164c;
        this.f1196w = interfaceC1163b;
    }
}
