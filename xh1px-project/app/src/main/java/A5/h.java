package A5;

import C6.h0;
import android.R;
import android.content.res.TypedArray;
import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import i.C0868g;
import l5.DialogC1035e;
import o.g1;

/* loaded from: classes.dex */
public final class h implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f342e;

    public /* synthetic */ h(int i4, Object obj) {
        this.f341d = i4;
        this.f342e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        Message message4;
        n.o oVar;
        switch (this.f341d) {
            case 0:
                n.o itemData = ((f) view).getItemData();
                i iVar = (i) this.f342e;
                if (!iVar.f352H.q(itemData, iVar.f351G, 0)) {
                    itemData.setChecked(true);
                    return;
                }
                return;
            case 1:
                com.google.android.material.datepicker.k kVar = (com.google.android.material.datepicker.k) this.f342e;
                int i4 = kVar.f10096g0;
                if (i4 == 2) {
                    kVar.T(1);
                    return;
                } else {
                    if (i4 == 1) {
                        kVar.T(2);
                        return;
                    }
                    return;
                }
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                C0868g c0868g = (C0868g) this.f342e;
                if (view == c0868g.f11692i && (message4 = c0868g.k) != null) {
                    message = Message.obtain(message4);
                } else if (view == c0868g.f11693l && (message3 = c0868g.f11695n) != null) {
                    message = Message.obtain(message3);
                } else if (view == c0868g.f11696o && (message2 = c0868g.f11698q) != null) {
                    message = Message.obtain(message2);
                } else {
                    message = null;
                }
                if (message != null) {
                    message.sendToTarget();
                }
                c0868g.f11682E.obtainMessage(1, c0868g.f11685b).sendToTarget();
                return;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                DialogC1035e dialogC1035e = (DialogC1035e) this.f342e;
                if (dialogC1035e.f12306m && dialogC1035e.isShowing()) {
                    if (!dialogC1035e.f12308o) {
                        TypedArray obtainStyledAttributes = dialogC1035e.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        dialogC1035e.f12307n = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        dialogC1035e.f12308o = true;
                    }
                    if (dialogC1035e.f12307n) {
                        dialogC1035e.cancel();
                        return;
                    }
                    return;
                }
                return;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                ((h0) this.f342e).b();
                return;
            default:
                g1 g1Var = ((Toolbar) this.f342e).f8472P;
                if (g1Var == null) {
                    oVar = null;
                } else {
                    oVar = g1Var.f13259e;
                }
                if (oVar != null) {
                    oVar.collapseActionView();
                    return;
                }
                return;
        }
    }
}
