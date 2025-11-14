package K3;

import android.view.View;
import com.google.android.material.checkbox.MaterialCheckBox;
import i.DialogInterfaceC0869h;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;

/* renamed from: K3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0094h implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2683e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2684f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2685g;

    public /* synthetic */ ViewOnClickListenerC0094h(Object obj, Object obj2, Object obj3, int i4) {
        this.f2682d = i4;
        this.f2683e = obj;
        this.f2684f = obj2;
        this.f2685g = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2682d) {
            case 0:
                ((InterfaceC1164c) this.f2683e).l(Integer.valueOf(((C0095i) this.f2684f).c()), (G1.a) this.f2685g);
                return;
            case 1:
                DialogInterfaceC0869h dialogInterfaceC0869h = (DialogInterfaceC0869h) this.f2683e;
                InterfaceC1163b interfaceC1163b = (InterfaceC1163b) this.f2684f;
                A.i iVar = (A.i) this.f2685g;
                dialogInterfaceC0869h.dismiss();
                interfaceC1163b.m(Boolean.valueOf(!((MaterialCheckBox) iVar.f89f).isChecked()));
                return;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                ((InterfaceC1164c) this.f2683e).l(Integer.valueOf(((C0095i) this.f2684f).c()), (G1.a) this.f2685g);
                return;
            default:
                ((InterfaceC1164c) this.f2683e).l(Integer.valueOf(((C0095i) this.f2684f).c()), (G1.a) this.f2685g);
                return;
        }
    }
}
