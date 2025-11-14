package i;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: i.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0864c implements AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0868g f11658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0865d f11659e;

    public C0864c(C0865d c0865d, C0868g c0868g) {
        this.f11659e = c0865d;
        this.f11658d = c0868g;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j) {
        C0865d c0865d = this.f11659e;
        DialogInterface.OnClickListener onClickListener = c0865d.f11673p;
        C0868g c0868g = this.f11658d;
        onClickListener.onClick(c0868g.f11685b, i4);
        if (!c0865d.f11675r) {
            c0868g.f11685b.dismiss();
        }
    }
}
