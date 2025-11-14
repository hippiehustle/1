package D2;

import A1.n;
import O3.C0220s;
import O3.C0222u;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import c3.C0573e;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import d1.C0594a;
import f4.C0708a;
import f4.C0709b;
import g0.C0749s;
import g4.C0779a;
import g4.C0780b;
import k3.C0965l;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f860f;

    public /* synthetic */ a(Object obj, int i4, Object obj2) {
        this.f858d = i4;
        this.f859e = obj;
        this.f860f = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Intent intent;
        switch (this.f858d) {
            case 0:
                c cVar = (c) this.f859e;
                cVar.f862e.m((d) this.f860f);
                return;
            case 1:
                E4.a aVar = (E4.a) this.f859e;
                aVar.f1196w.m((E4.c) this.f860f);
                return;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                ((InterfaceC1163b) this.f859e).m((G1.a) this.f860f);
                return;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                ((InterfaceC1163b) this.f859e).m((N3.e) this.f860f);
                return;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                ((C0220s) this.f859e).f3994v.m(((C0222u) this.f860f).f3996a);
                return;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                ((Q3.i) this.f859e).f4856v.m(((C0594a) this.f860f).f10364a);
                return;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                ((InterfaceC1163b) this.f859e).m(Integer.valueOf(((R4.a) this.f860f).f5122c));
                return;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                ((InterfaceC1163b) this.f859e).m(((C0594a) this.f860f).f10364a);
                return;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                ((InterfaceC1163b) this.f859e).m(((C0708a) this.f860f).f10757f);
                return;
            case 9:
                ((InterfaceC1163b) this.f859e).m(((C0779a) this.f860f).f11154e);
                return;
            case 10:
                ((InterfaceC1163b) this.f859e).m(((C0709b) this.f860f).f10762f);
                return;
            case 11:
                ((InterfaceC1163b) this.f859e).m(((C0780b) this.f860f).f11159e);
                return;
            case 12:
                C0573e c0573e = (C0573e) this.f859e;
                MaterialButton materialButton = (MaterialButton) this.f860f;
                try {
                    C0749s c0749s = c0573e.f9627z0;
                    if (c0749s != null) {
                        if (c0573e.Y()) {
                            c0573e.W();
                            intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                            intent.addCategory("android.intent.category.OPENABLE");
                            intent.setType("application/zip");
                        } else {
                            c0573e.W();
                            intent = new Intent("android.intent.action.CREATE_DOCUMENT");
                            intent.addCategory("android.intent.category.OPENABLE");
                            intent.setType("application/zip");
                            intent.putExtra("android.intent.extra.TITLE", "SmartAutoClicker-Backup.zip");
                        }
                        c0749s.a(intent);
                        return;
                    }
                    o6.j.i("backupActivityResult");
                    throw null;
                } catch (ActivityNotFoundException unused) {
                    Log.e("BackupDialogFragment", "No application found to load/save a zip file.");
                    Toast.makeText(materialButton.getContext(), R.string.message_backup_error_no_zip_app, 1).show();
                    return;
                }
            case 13:
                c4.i iVar = (c4.i) this.f859e;
                iVar.f9666v.m((String) this.f860f);
                return;
            case 14:
                ((InterfaceC1163b) this.f859e).m((C0965l) this.f860f);
                return;
            default:
                ((w1.e) this.f859e).h(new n((InterfaceC1163b) this.f860f, 26, view));
                return;
        }
    }
}
