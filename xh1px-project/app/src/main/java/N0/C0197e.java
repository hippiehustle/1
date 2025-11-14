package N0;

import android.graphics.Matrix;
import com.airbnb.lottie.LottieAnimationView;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* renamed from: N0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0197e implements A {
    @Override // N0.A
    public final void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        C0197e c0197e = LottieAnimationView.f9731t;
        Matrix matrix = Z0.k.f7301a;
        if (!(th instanceof SocketException) && !(th instanceof ClosedChannelException) && !(th instanceof InterruptedIOException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof UnknownHostException) && !(th instanceof UnknownServiceException)) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
        Z0.c.c("Unable to load composition.", th);
    }
}
