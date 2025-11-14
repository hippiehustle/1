package E4;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import t0.s0;

/* loaded from: classes.dex */
public final class o extends s0 {

    /* renamed from: u, reason: collision with root package name */
    public final A4.d f1242u;

    /* renamed from: v, reason: collision with root package name */
    public final S3.a f1243v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(A4.d dVar, A1.o oVar, A1.e eVar) {
        super((MaterialCardView) dVar.f295e);
        o6.j.e(oVar, "bitmapProvider");
        o6.j.e(eVar, "onConditionClicked");
        this.f1242u = dVar;
        S3.a aVar = new S3.a(oVar, eVar);
        this.f1243v = aVar;
        ((RecyclerView) dVar.f296f).setAdapter(aVar);
    }
}
