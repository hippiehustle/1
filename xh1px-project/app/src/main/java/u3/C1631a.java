package u3;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import h1.AbstractC0812e;
import k4.I;
import o6.j;

/* renamed from: u3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1631a extends AbstractC0812e {

    /* renamed from: c, reason: collision with root package name */
    public final I f15317c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15318d;

    public C1631a(I i4) {
        super(new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
        this.f15317c = i4;
    }

    @Override // h1.AbstractC0812e
    public final void a(Context context) {
        boolean z8;
        j.e(context, "context");
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f15318d = z8;
    }

    @Override // h1.AbstractC0812e
    public final void b() {
        this.f15318d = false;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z8;
        j.e(context, "context");
        j.e(intent, "intent");
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            z8 = true;
        } else {
            z8 = false;
        }
        Context context2 = this.f11321b;
        if (context2 != null) {
            boolean z9 = this.f15318d;
            if (z9 == z8) {
                return;
            }
            if (context2 != null) {
                Log.i("NightModeReceiver", "Ui mode changed, isNightModeEnabled=" + z9);
                this.f15318d = z8;
                this.f15317c.l(context, Boolean.valueOf(z8));
                return;
            }
            throw new IllegalStateException("Can't get night mode value, listener is not registered");
        }
        throw new IllegalStateException("Can't get night mode value, listener is not registered");
    }
}
