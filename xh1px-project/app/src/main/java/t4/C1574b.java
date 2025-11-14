package t4;

import O7.InterfaceC0234g;
import com.google.android.material.slider.Slider;
import com.google.android.material.textview.MaterialTextView;
import d6.InterfaceC0617c;
import o6.C1282a;
import o6.InterfaceC1288g;

/* renamed from: t4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1574b implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1583k f15064e;

    public /* synthetic */ C1574b(C1583k c1583k, int i4) {
        this.f15063d = i4;
        this.f15064e = c1583k;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f15063d) {
            case 0:
                return new C1282a(2, this.f15064e, C1583k.class, "updateScenarioName", "updateScenarioName(Ljava/lang/String;)V", 4);
            case 1:
                return new C1282a(2, this.f15064e, C1583k.class, "updateRandomization", "updateRandomization(Z)V", 4);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return new C1282a(2, this.f15064e, C1583k.class, "updateKeepScreenOn", "updateKeepScreenOn(Z)V", 4);
            default:
                return new C1282a(2, this.f15064e, C1583k.class, "updateQuality", "updateQuality(Lcom/buzbuz/smartautoclicker/feature/smart/config/ui/scenario/config/UiDetectionQuality;)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f15063d) {
            case 0:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case 1:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            default:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.f15063d) {
            case 0:
                return a().hashCode();
            case 1:
                return a().hashCode();
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        int i4 = this.f15063d;
        boolean z8 = true;
        Z5.y yVar = Z5.y.f7506a;
        C1583k c1583k = this.f15064e;
        switch (i4) {
            case 0:
                String str = (String) obj;
                F3.a aVar = c1583k.f15082m;
                if (aVar != null) {
                    E2.c.y0((A.i) aVar.f1305f, str, 1);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                F3.a aVar2 = c1583k.f15082m;
                if (aVar2 != null) {
                    A4.c cVar = (A4.c) aVar2.f1306g;
                    o6.j.b(cVar);
                    E2.b.H(cVar, booleanValue);
                    E2.b.I(cVar, booleanValue ? 1 : 0);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                F3.a aVar3 = c1583k.f15082m;
                if (aVar3 != null) {
                    A4.c cVar2 = (A4.c) aVar3.f1307h;
                    o6.j.b(cVar2);
                    E2.b.H(cVar2, booleanValue2);
                    E2.b.I(cVar2, booleanValue2 ? 1 : 0);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            default:
                y yVar2 = (y) obj;
                F3.a aVar4 = c1583k.f15082m;
                if (aVar4 != null) {
                    Slider slider = (Slider) aVar4.f1308i;
                    ((MaterialTextView) aVar4.j).setText(yVar2.f15120a);
                    if (slider.getValue() != 0.0f) {
                        z8 = false;
                    }
                    slider.setValue(yVar2.f15121b);
                    if (z8) {
                        slider.setValueFrom(400.0f);
                        slider.setValueTo(yVar2.f15122c);
                    }
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
        }
    }
}
