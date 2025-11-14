package o;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import i.C0865d;
import i.DialogInterfaceC0869h;

/* loaded from: classes.dex */
public final class J implements O, DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public DialogInterfaceC0869h f13090d;

    /* renamed from: e, reason: collision with root package name */
    public K f13091e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f13092f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ P f13093g;

    public J(P p8) {
        this.f13093g = p8;
    }

    @Override // o.O
    public final int a() {
        return 0;
    }

    @Override // o.O
    public final boolean b() {
        DialogInterfaceC0869h dialogInterfaceC0869h = this.f13090d;
        if (dialogInterfaceC0869h != null) {
            return dialogInterfaceC0869h.isShowing();
        }
        return false;
    }

    @Override // o.O
    public final Drawable d() {
        return null;
    }

    @Override // o.O
    public final void dismiss() {
        DialogInterfaceC0869h dialogInterfaceC0869h = this.f13090d;
        if (dialogInterfaceC0869h != null) {
            dialogInterfaceC0869h.dismiss();
            this.f13090d = null;
        }
    }

    @Override // o.O
    public final void f(CharSequence charSequence) {
        this.f13092f = charSequence;
    }

    @Override // o.O
    public final void g(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // o.O
    public final void h(int i4) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // o.O
    public final void j(int i4) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // o.O
    public final void k(int i4) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // o.O
    public final void l(int i4, int i8) {
        if (this.f13091e == null) {
            return;
        }
        P p8 = this.f13093g;
        M.i iVar = new M.i(p8.getPopupContext());
        C0865d c0865d = (C0865d) iVar.f3288e;
        CharSequence charSequence = this.f13092f;
        if (charSequence != null) {
            c0865d.f11663d = charSequence;
        }
        K k = this.f13091e;
        int selectedItemPosition = p8.getSelectedItemPosition();
        c0865d.f11672o = k;
        c0865d.f11673p = this;
        c0865d.f11676s = selectedItemPosition;
        c0865d.f11675r = true;
        DialogInterfaceC0869h c6 = iVar.c();
        this.f13090d = c6;
        AlertController$RecycleListView alertController$RecycleListView = c6.f11708i.f11689f;
        alertController$RecycleListView.setTextDirection(i4);
        alertController$RecycleListView.setTextAlignment(i8);
        this.f13090d.show();
    }

    @Override // o.O
    public final int m() {
        return 0;
    }

    @Override // o.O
    public final CharSequence n() {
        return this.f13092f;
    }

    @Override // o.O
    public final void o(ListAdapter listAdapter) {
        this.f13091e = (K) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        P p8 = this.f13093g;
        p8.setSelection(i4);
        if (p8.getOnItemClickListener() != null) {
            p8.performItemClick(null, i4, this.f13091e.getItemId(i4));
        }
        dismiss();
    }
}
