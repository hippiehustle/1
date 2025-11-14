package X4;

import A1.o;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;
import t0.s0;

/* loaded from: classes.dex */
public final class i extends s0 {

    /* renamed from: A, reason: collision with root package name */
    public final R4.d f6971A;

    /* renamed from: u, reason: collision with root package name */
    public final F3.f f6972u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC1163b f6973v;

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC1163b f6974w;

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC1163b f6975x;

    /* renamed from: y, reason: collision with root package name */
    public final InterfaceC1163b f6976y;

    /* renamed from: z, reason: collision with root package name */
    public final InterfaceC1163b f6977z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(F3.f fVar, o oVar, A1.e eVar, W4.i iVar, W4.i iVar2, W4.i iVar3, A1.e eVar2) {
        super((MaterialCardView) fVar.f1333e);
        o6.j.e(oVar, "bitmapProvider");
        o6.j.e(eVar, "startScenarioListener");
        o6.j.e(iVar, "expandCollapseListener");
        o6.j.e(iVar2, "exportClickListener");
        o6.j.e(iVar3, "copyClickedListener");
        o6.j.e(eVar2, "deleteScenarioListener");
        this.f6972u = fVar;
        this.f6973v = eVar;
        this.f6974w = iVar;
        this.f6975x = iVar2;
        this.f6976y = iVar3;
        this.f6977z = eVar2;
        R4.d dVar = new R4.d((InterfaceC1164c) oVar);
        this.f6971A = dVar;
        ((RecyclerView) fVar.f1338l).setAdapter(dVar);
    }
}
