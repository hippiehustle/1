package G1;

import Z5.y;
import android.view.View;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f1702e;

    public /* synthetic */ d(f fVar, int i4) {
        this.f1701d = i4;
        this.f1702e = fVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        switch (this.f1701d) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                f fVar = this.f1702e;
                fVar.X(intValue);
                K2.d dVar = fVar.f1708L;
                if (dVar != null) {
                    dVar.e();
                    return y.f7506a;
                }
                o6.j.i("briefPanelAnimationController");
                throw null;
            case 1:
                o6.j.e((View) obj, "it");
                f fVar2 = this.f1702e;
                fVar2.b0(fVar2.K.k);
                return y.f7506a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                o6.j.e((View) obj, "it");
                f fVar3 = this.f1702e;
                K2.d dVar2 = fVar3.f1708L;
                if (dVar2 != null) {
                    dVar2.e();
                    fVar3.W(fVar3.K.k);
                    return y.f7506a;
                }
                o6.j.i("briefPanelAnimationController");
                throw null;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                o6.j.e((View) obj, "it");
                f fVar4 = this.f1702e;
                K2.d dVar3 = fVar4.f1708L;
                if (dVar3 != null) {
                    dVar3.e();
                    int i4 = fVar4.K.k;
                    fVar4.a0(i4, i4 - 1);
                    return y.f7506a;
                }
                o6.j.i("briefPanelAnimationController");
                throw null;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                o6.j.e((View) obj, "it");
                f fVar5 = this.f1702e;
                K2.d dVar4 = fVar5.f1708L;
                if (dVar4 != null) {
                    dVar4.e();
                    int i8 = fVar5.K.k;
                    fVar5.a0(i8, i8 + 1);
                    return y.f7506a;
                }
                o6.j.i("briefPanelAnimationController");
                throw null;
            default:
                o6.j.e((View) obj, "it");
                f fVar6 = this.f1702e;
                int i9 = fVar6.K.k;
                b bVar = fVar6.f1711O;
                if (bVar != null) {
                    fVar6.Z(i9, bVar.a());
                    return y.f7506a;
                }
                o6.j.i("briefAdapter");
                throw null;
        }
    }
}
