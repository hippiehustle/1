package E2;

import Z.g;
import android.view.View;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1175d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1162a f1176e;

    public /* synthetic */ a(int i4, InterfaceC1162a interfaceC1162a) {
        this.f1175d = i4;
        this.f1176e = interfaceC1162a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1175d) {
            case 0:
                this.f1176e.a();
                return;
            case 1:
                this.f1176e.a();
                return;
            case g.FLOAT_FIELD_NUMBER /* 2 */:
                this.f1176e.a();
                return;
            case g.INTEGER_FIELD_NUMBER /* 3 */:
                this.f1176e.a();
                return;
            case g.LONG_FIELD_NUMBER /* 4 */:
                this.f1176e.a();
                return;
            default:
                this.f1176e.a();
                return;
        }
    }
}
