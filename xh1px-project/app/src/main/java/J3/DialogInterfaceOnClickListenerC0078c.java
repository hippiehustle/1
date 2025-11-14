package J3;

import android.content.DialogInterface;

/* renamed from: J3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0078c implements DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2430d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f2431e;

    public /* synthetic */ DialogInterfaceOnClickListenerC0078c(u uVar, int i4) {
        this.f2430d = i4;
        this.f2431e = uVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        switch (this.f2430d) {
            case 0:
                o6.j.e(dialogInterface, "<unused var>");
                this.f2431e.U();
                return;
            case 1:
                o6.j.e(dialogInterface, "<unused var>");
                this.f2431e.S().e();
                return;
            default:
                this.f2431e.f2465I.a();
                return;
        }
    }
}
