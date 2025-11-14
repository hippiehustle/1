package c3;

import O7.V;
import O7.i0;
import android.content.Context;
import androidx.lifecycle.Z;
import b3.C0530a;
import b3.n;
import com.buzbuz.smartautoclicker.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc3/j;", "Landroidx/lifecycle/Z;", "backup_fDroidRelease"}, k = 1, mv = {Z.g.FLOAT_FIELD_NUMBER, Z.g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final n f9645b;

    /* renamed from: c, reason: collision with root package name */
    public final Y1.d f9646c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f9647d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f9648e;

    public j(n nVar, Y1.d dVar) {
        o6.j.e(nVar, "repository");
        o6.j.e(dVar, "displayConfigManager");
        this.f9645b = nVar;
        this.f9646c = dVar;
        i0 c6 = V.c(null);
        this.f9647d = c6;
        this.f9648e = c6;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(j jVar, Context context, b3.e eVar, boolean z8) {
        g f8;
        String string;
        String string2;
        int i4;
        String string3;
        int i8;
        String string4;
        i0 i0Var = jVar.f9647d;
        int i9 = 0;
        if (eVar instanceof b3.c) {
            b3.c cVar = (b3.c) eVar;
            if (z8) {
                Integer num = cVar.f9124a;
                if (num != null) {
                    i9 = num.intValue();
                }
                string4 = context.getString(R.string.message_backup_import_progress, Integer.valueOf(i9));
            } else {
                Integer num2 = cVar.f9124a;
                if (num2 != null) {
                    i8 = num2.intValue();
                } else {
                    i8 = 0;
                }
                Integer valueOf = Integer.valueOf(i8);
                Integer num3 = cVar.f9125b;
                if (num3 != null) {
                    i9 = num3.intValue();
                }
                string4 = context.getString(R.string.message_backup_create_progress, valueOf, Integer.valueOf(i9));
            }
            f8 = new g(8, 0, 0, 8, 8, false, false, null, string4, null, null, 1664);
        } else if (o6.j.a(eVar, b3.d.f9126a)) {
            f8 = new g(8, 0, 0, 8, 8, false, false, null, context.getString(R.string.message_backup_import_verification), null, null, 1664);
        } else if (o6.j.a(eVar, b3.b.f9123a)) {
            if (z8) {
                string3 = context.getString(R.string.message_backup_import_error);
            } else {
                string3 = context.getString(R.string.message_backup_create_error);
            }
            f8 = new g(8, 8, 0, 8, 0, false, true, null, string3, Integer.valueOf(R.drawable.img_error), -65536, 128);
        } else if (eVar instanceof C0530a) {
            C0530a c0530a = (C0530a) eVar;
            int i10 = R.drawable.img_success;
            if (!z8) {
                string2 = context.getString(R.string.message_backup_create_completed);
            } else {
                int i11 = c0530a.f9121b;
                int i12 = c0530a.f9120a;
                if (i11 == 0) {
                    string2 = context.getString(R.string.message_backup_import_completed, Integer.valueOf(i12));
                } else {
                    string = context.getString(R.string.message_backup_import_completed_with_error, Integer.valueOf(i12), Integer.valueOf(c0530a.f9121b));
                    i10 = R.drawable.ic_warning;
                    o6.j.b(string);
                    if (!c0530a.f9122c) {
                        i10 = R.drawable.ic_warning;
                    } else {
                        i9 = 8;
                    }
                    int i13 = i9;
                    if (i10 != R.drawable.ic_warning) {
                        i4 = -256;
                    } else {
                        i4 = -16711936;
                    }
                    f8 = new g(8, 8, 0, i13, 0, true, false, null, string, Integer.valueOf(i10), Integer.valueOf(i4), 128);
                }
            }
            string = string2;
            o6.j.b(string);
            if (!c0530a.f9122c) {
            }
            int i132 = i9;
            if (i10 != R.drawable.ic_warning) {
            }
            f8 = new g(8, 8, 0, i132, 0, true, false, null, string, Integer.valueOf(i10), Integer.valueOf(i4), 128);
        } else if (eVar == null) {
            f8 = f(context, z8);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        i0Var.getClass();
        i0Var.h(null, f8);
    }

    public static g f(Context context, boolean z8) {
        String string;
        int i4;
        if (z8) {
            string = context.getString(R.string.item_title_backup_import_select_file);
        } else {
            string = context.getString(R.string.item_title_backup_create_select_file);
        }
        String str = string;
        if (z8) {
            i4 = R.drawable.img_load;
        } else {
            i4 = R.drawable.img_save;
        }
        return new g(0, 8, 8, 8, 0, false, true, str, null, Integer.valueOf(i4), null, 1280);
    }
}
