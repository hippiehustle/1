package Y4;

import Z5.y;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f7170e;

    public /* synthetic */ a(d dVar, int i4) {
        this.f7169d = i4;
        this.f7170e = dVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f7169d) {
            case 0:
                return Long.valueOf(this.f7170e.N().getLong(":copy:fragment_args_key_scenario_id"));
            case 1:
                return Boolean.valueOf(this.f7170e.N().getBoolean(":copy:fragment_args_key_is_smart"));
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                String string = this.f7170e.N().getString(":copy:fragment_args_key_default_copy_name");
                if (string == null) {
                    return "";
                }
                return string;
            default:
                this.f7170e.S(false, false);
                return y.f7506a;
        }
    }
}
