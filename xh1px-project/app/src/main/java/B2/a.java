package B2;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import m5.f;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f442a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1163b f443b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M0.a f444c;

    public /* synthetic */ a(InterfaceC1163b interfaceC1163b, M0.a aVar, int i4) {
        this.f442a = i4;
        this.f443b = interfaceC1163b;
        this.f444c = aVar;
    }

    @Override // m5.f
    public final void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i4, boolean z8) {
        switch (this.f442a) {
            case 0:
                A4.c cVar = (A4.c) this.f444c;
                InterfaceC1163b interfaceC1163b = this.f443b;
                if (!z8) {
                    if (materialButtonToggleGroup.getCheckedButtonId() < 0) {
                        interfaceC1163b.m(null);
                        return;
                    }
                    return;
                } else if (i4 == ((MaterialButton) cVar.f292f).getId()) {
                    interfaceC1163b.m(0);
                    return;
                } else {
                    if (i4 == ((MaterialButton) cVar.f293g).getId()) {
                        interfaceC1163b.m(1);
                        return;
                    }
                    return;
                }
            default:
                A4.a aVar = (A4.a) this.f444c;
                InterfaceC1163b interfaceC1163b2 = this.f443b;
                if (!z8) {
                    if (materialButtonToggleGroup.getCheckedButtonId() < 0) {
                        interfaceC1163b2.m(null);
                        return;
                    }
                    return;
                } else if (i4 == ((MaterialButton) aVar.f281f).getId()) {
                    interfaceC1163b2.m(0);
                    return;
                } else if (i4 == ((MaterialButton) aVar.f282g).getId()) {
                    interfaceC1163b2.m(1);
                    return;
                } else {
                    if (i4 == ((MaterialButton) aVar.f283h).getId()) {
                        interfaceC1163b2.m(2);
                        return;
                    }
                    return;
                }
        }
    }
}
