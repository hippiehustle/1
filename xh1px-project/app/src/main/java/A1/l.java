package A1;

import android.content.DialogInterface;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import i.C0865d;
import i.DialogInterfaceC0869h;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class l extends w1.e {

    /* renamed from: p, reason: collision with root package name */
    public final int f257p;

    /* renamed from: q, reason: collision with root package name */
    public final int f258q;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC1163b f259r;

    /* renamed from: s, reason: collision with root package name */
    public U2.a f260s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f261t;

    /* renamed from: u, reason: collision with root package name */
    public DialogInterfaceC0869h f262u;

    public l(int i4, int i8, int i9, InterfaceC1163b interfaceC1163b) {
        super(Integer.valueOf(i4), true);
        this.f257p = i8;
        this.f258q = i9;
        this.f259r = interfaceC1163b;
    }

    @Override // w1.e
    public final void p() {
        View inflate = LayoutInflater.from(k()).inflate(R.layout.dialog_base_move_to, (ViewGroup) null, false);
        View r8 = E2.b.r(inflate, R.id.field_move_to_index);
        if (r8 != null) {
            A.i a3 = A.i.a(r8);
            TextInputEditText textInputEditText = (TextInputEditText) a3.f89f;
            U2.a aVar = new U2.a((FrameLayout) inflate, a3, 1);
            int i4 = this.f258q;
            textInputEditText.setFilters(new K2.i[]{new K2.i(1, Integer.valueOf(i4))});
            ((TextInputLayout) a3.f88e).setHint(R.string.dialog_move_to_position_label);
            E2.c.y0(a3, String.valueOf(this.f257p), 2);
            textInputEditText.setHint("Max: " + i4);
            E2.c.x0(a3, new h(0, this));
            this.f260s = aVar;
            s5.b bVar = new s5.b(E2.b.u(k()));
            C0865d c0865d = (C0865d) bVar.f3288e;
            bVar.l(R.string.dialog_move_to_title);
            U2.a aVar2 = this.f260s;
            if (aVar2 != null) {
                c0865d.f11674q = aVar2.f6083e;
                final int i8 = 0;
                c0865d.f11671n = new i(0, this);
                bVar.k(android.R.string.ok, new DialogInterface.OnClickListener(this) { // from class: A1.j

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ l f254e;

                    {
                        this.f254e = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i9) {
                        switch (i8) {
                            case 0:
                                l lVar = this.f254e;
                                U2.a aVar3 = lVar.f260s;
                                Integer num = null;
                                if (aVar3 != null) {
                                    Editable text = ((TextInputEditText) aVar3.f6084f.f89f).getText();
                                    if (text != null) {
                                        try {
                                            num = Integer.valueOf(Integer.parseInt(text.toString()));
                                        } catch (NumberFormatException unused) {
                                        }
                                        if (num != null) {
                                            lVar.f259r.m(Integer.valueOf(num.intValue()));
                                            lVar.a();
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                o6.j.i("viewBinding");
                                throw null;
                            default:
                                this.f254e.a();
                                return;
                        }
                    }
                });
                final int i9 = 1;
                bVar.j(new DialogInterface.OnClickListener(this) { // from class: A1.j

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ l f254e;

                    {
                        this.f254e = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i92) {
                        switch (i9) {
                            case 0:
                                l lVar = this.f254e;
                                U2.a aVar3 = lVar.f260s;
                                Integer num = null;
                                if (aVar3 != null) {
                                    Editable text = ((TextInputEditText) aVar3.f6084f.f89f).getText();
                                    if (text != null) {
                                        try {
                                            num = Integer.valueOf(Integer.parseInt(text.toString()));
                                        } catch (NumberFormatException unused) {
                                        }
                                        if (num != null) {
                                            lVar.f259r.m(Integer.valueOf(num.intValue()));
                                            lVar.a();
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                o6.j.i("viewBinding");
                                throw null;
                            default:
                                this.f254e.a();
                                return;
                        }
                    }
                });
                c0865d.f11670m = new k(0, this);
                DialogInterfaceC0869h c6 = bVar.c();
                this.f262u = c6;
                Window window = c6.getWindow();
                if (window != null) {
                    window.setType(2032);
                    return;
                }
                return;
            }
            o6.j.i("viewBinding");
            throw null;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.field_move_to_index)));
    }

    @Override // w1.e
    public final void q() {
        DialogInterfaceC0869h dialogInterfaceC0869h = this.f262u;
        if (dialogInterfaceC0869h != null) {
            dialogInterfaceC0869h.dismiss();
        }
        this.f262u = null;
    }

    @Override // w1.e
    public final void v() {
        if (this.f261t) {
            return;
        }
        this.f261t = true;
        DialogInterfaceC0869h dialogInterfaceC0869h = this.f262u;
        if (dialogInterfaceC0869h != null) {
            dialogInterfaceC0869h.show();
        }
        U2.a aVar = this.f260s;
        if (aVar != null) {
            ((TextInputEditText) aVar.f6084f.f89f).requestFocus();
        } else {
            o6.j.i("viewBinding");
            throw null;
        }
    }

    @Override // w1.e
    public final void w() {
        if (!this.f261t) {
            return;
        }
        DialogInterfaceC0869h dialogInterfaceC0869h = this.f262u;
        if (dialogInterfaceC0869h != null) {
            dialogInterfaceC0869h.hide();
        }
        this.f261t = false;
    }
}
